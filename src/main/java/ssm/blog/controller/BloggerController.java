package ssm.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.blog.service.BloggerService;

import javax.annotation.Resource;

/**
 * Created by hpb on 2017-11-17.
 */
@Controller
@RequestMapping("blogger")
public class BloggerController {
    @Resource
    private BloggerService bloggerService;
}
