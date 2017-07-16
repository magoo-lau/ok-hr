/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.core.cache.ehcache;

import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;

import com.glaf.core.cache.Cache;
import com.glaf.core.cache.CacheException;
import com.glaf.core.context.ContextFactory;

public class EHCacheImpl implements Cache {

	protected static ConcurrentMap<String, Ehcache> cacheConcurrentMap = new ConcurrentHashMap<String, Ehcache>();

	private CacheManager cacheManager;

	private Ehcache cache;

	private Properties properties;

	private int timeToLive;

	public EHCacheImpl() {

	}

	public void clear() {
		try {
			getCache().removeAll();
		} catch (Exception ex) {
		}

		Iterator<String> iterator = cacheConcurrentMap.keySet().iterator();
		while (iterator.hasNext()) {
			String region = iterator.next();
			try {
				getCache(region).removeAll();
			} catch (Exception ex) {
			}
		}
	}

	public void clear(String region) {
		try {
			getCache(region).removeAll();
		} catch (ClassCastException e) {
			throw new CacheException(e);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public Object get(String key) {
		try {
			if (key == null) {
				return null;
			} else {
				Element element = getCache().get(key);
				if (element == null) {
					return null;
				} else {
					return element.getObjectValue();
				}
			}
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public String get(String region, String key) {
		try {
			if (key == null) {
				return null;
			} else {
				Element element = getCache(region).get(key);
				if (element == null) {
					return null;
				} else {
					return (String)element.getObjectValue();
				}
			}
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public Ehcache getCache() {
		if (cache == null) {
			cache = ContextFactory.getBean("ehCache");
		}
		return cache;
	}

	public Ehcache getCache(String region) {
		Ehcache regionCache = cacheConcurrentMap.get(region);
		if (regionCache == null) {
			if (cacheManager == null) {
				cacheManager = ContextFactory.getBean("ehCacheManager");
			}
			regionCache = cacheManager.getCache(region);
			cacheConcurrentMap.put(region, regionCache);
		}
		return regionCache;
	}

	public CacheManager getCacheManager() {
		return cacheManager;
	}

	public Properties getProperties() {
		return properties;
	}

	public String getRegionName() {
		return getCache().getName();
	}

	public int getTimeToLive() {
		return timeToLive;
	}

	public void init() {
		if (properties == null) {
			properties = new Properties();
		}
	}

	public void put(String key, String value) {
		try {
			Element element = new Element(key, value);
			if (timeToLive > 0) {
				element.setTimeToLive(timeToLive);
			}
			getCache().put(element);
		} catch (IllegalArgumentException e) {
			throw new CacheException(e);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public void put(String region, String key, String value) {
		try {
			Element element = new Element(key, value);
			if (timeToLive > 0) {
				element.setTimeToLive(timeToLive);
			}
			getCache(region).put(element);
		} catch (IllegalArgumentException e) {
			throw new CacheException(e);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public void remove(String key) {
		try {
			getCache().remove(key);
		} catch (ClassCastException e) {
			throw new CacheException(e);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public void remove(String region, String key) {
		try {
			getCache(region).remove(key);
		} catch (ClassCastException e) {
			throw new CacheException(e);
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public void setCache(Ehcache cache) {
		this.cache = cache;
	}

	public void setCacheManager(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setTimeToLive(int timeToLive) {
		this.timeToLive = timeToLive;
	}

	public void shutdown() {
		try {
			getCache().getCacheManager().shutdown();
		} catch (IllegalStateException e) {
			throw new CacheException(e);
		} catch (net.sf.ehcache.CacheException e) {
			throw new CacheException(e);
		}
	}

	public String toString() {
		return "EHCache(" + getRegionName() + ')';
	}

}
