package com.glaf.hr.base.web.springmvc;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.glaf.base.modules.sys.model.SysOrganization;
import com.glaf.base.modules.sys.service.SysOrganizationService;
import com.glaf.core.context.ContextFactory;
import com.glaf.core.security.LoginContext;
import com.glaf.core.util.RequestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller("/hr/base")
@RequestMapping("/hr/base")
public class HrBaseController {
    protected static final Log logger = LogFactory.getLog(HrBaseController.class);


    @ResponseBody
    @RequestMapping("/department")
    public byte[] department(HttpServletRequest request) {
        LoginContext loginContext = RequestUtils.getLoginContext(request);
        String actorId =  loginContext.getActorId();
        try {

            //BaseDataManager.getInstance().getSysApplicationService().getApplicationListWithChildren();
            SysOrganizationService sysOrganizationService = ContextFactory.getBean("sysOrganizationService");
            List<SysOrganization> sysOrganizationList = sysOrganizationService.getSysOrganizationList();
            JSONArray jsonArray = (JSONArray) JSON.toJSON(sysOrganizationList);
            return jsonArray.toJSONString().getBytes("UTF-8");
        } catch (Exception ex) {
            ex.printStackTrace();
            logger.error(ex);

        }
        return "[]".getBytes();
    }

}
