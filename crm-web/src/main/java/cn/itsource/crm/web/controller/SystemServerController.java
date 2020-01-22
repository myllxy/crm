package cn.itsource.crm.web.controller;


import cn.itsource.crm.web.system.Server;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/systemServer")
@CrossOrigin
public class SystemServerController {

    @RequestMapping(value = "/list", method = RequestMethod.POST,name = "查看系统状态")
    @ResponseBody
    public Server getInfo()  {
        Server server = new Server();
        try {
            server.copyTo();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(server);

        return server;
    }




}
