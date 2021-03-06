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

package com.glaf.flowable.executionlistener;

import org.flowable.common.engine.api.delegate.Expression;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.core.context.ContextFactory;

public class SpringBeanInjectListener implements ExecutionListener {
	private static final long serialVersionUID = 1L;
	
	protected final static Log logger = LogFactory
			.getLog(SpringBeanInjectListener.class);

	protected Expression beanId;

	protected Expression targetId;

	public Expression getBeanId() {
		return beanId;
	}

	public Expression getTargetId() {
		return targetId;
	}

	@Override
	public void notify(DelegateExecution execution) {
		logger.debug("----------------------------------------------------");
		logger.debug("----------------SpringBeanInjectListener------------");
		logger.debug("----------------------------------------------------");
		if (beanId != null && targetId != null) {
			String source = beanId.getExpressionText();
			String target = targetId.getExpressionText();
			execution.setVariable(target, ContextFactory.getBean(source));
		}
	}

	public void setBeanId(Expression beanId) {
		this.beanId = beanId;
	}

	public void setTargetId(Expression targetId) {
		this.targetId = targetId;
	}

}