package com.qiang.webservice.contorll;

import com.google.gson.Gson;
import com.qiang.webservice.dto.ListItemDTO;
import com.qiang.webservice.util.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.*;

@RestController
@RequestMapping("/List")
public class GetListContorll {
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public Map getList(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("UTF-8");

        Map<String,Object> ResultData = new HashMap<>();
        List<ListItemDTO> ListData = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ListItemDTO itemDTO = new ListItemDTO();
            itemDTO.setTitle("this is"+i);
            itemDTO.setContext("context");
            itemDTO.setSrc(Api.SourceUrl+"d"+(i+1)+".jpg");
            ListData.add(itemDTO);
        }
        ResultData.put("text","请求成功");
        ResultData.put("listdata",ListData);
        return ResultData;
    }
}
