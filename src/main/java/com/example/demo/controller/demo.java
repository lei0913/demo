package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * ssbfenqi
 * Date:2021/11/6
 * Timme:16:27
 * author: libanglei
 */
@RestController
public class demo {
    @RequestMapping("/auto")
    public void test1() {
        Robot robot = null;
        try {

            robot = new Robot();

            robot.mouseMove(1000,500);
            //按下鼠标左键
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(200,50);
            robot.delay(1000);
            //释放鼠标左键
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(1000);
            //按下键盘指定的键wo

            robot.keyPress(KeyEvent.VK_W);
            //释放键盘指定的键
            robot.keyRelease(KeyEvent.VK_W);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyRelease(KeyEvent.VK_O);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            robot.delay(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }






    }


}
