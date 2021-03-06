package cn.how2j.trend.web;

import cn.how2j.trend.pojo.Index;
import cn.how2j.trend.service.IndexService;
import jdk.jfr.events.ExceptionThrownEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    //  http://127.0.0.1:8001/freshCodes
    //  http://127.0.0.1:8001/getCodes
    //  http://127.0.0.1:8001/removeCodes

    @RequestMapping("/getCodes")
    public List<Index> get() throws Exception {
        return indexService.get();
    }

    @RequestMapping("/freshCodes")
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }

    @RequestMapping("/removeCodes")
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }
}
