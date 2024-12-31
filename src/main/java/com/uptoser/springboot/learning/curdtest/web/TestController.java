//package me.ibeyond.springboottest.test.web;
//
//import me.ibeyond.springboottest.config.UserSettings;
//import me.ibeyond.springboottest.test.mapper.PersionMapper;
//import me.ibeyond.springboottest.test.model.Persion;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//@RequestMapping(value = "/api")
//public class TestController {
//
//    private  UserSettings userSettings;
//
//    @Autowired
//    private PersionMapper persionMapper;
//
//    @Autowired
//    public TestController(UserSettings userSettings){
//        this.userSettings = userSettings;
//    }
//
//    @RequestMapping(value = "/main1", method = RequestMethod.GET)
//    public String main(Model model) {
//        List<Integer> list = new ArrayList<>();
//        list.add(123);
//        list.add(234);
//        list.add(345);
//        model.addAttribute("singlePerson", userSettings);
//        model.addAttribute("list", list);
//        return "index";
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/addPersion", method = RequestMethod.POST)
//    public void addPersion(Persion persion) {
//        persionMapper.addPersion(persion);
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/selPersion", method = RequestMethod.POST)
//    public Persion selPersion(int i) {
//        Persion persion = persionMapper.getPersion(i);
//        return persion;
//    }
//}
