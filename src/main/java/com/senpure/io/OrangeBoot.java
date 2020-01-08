package com.senpure.io;

import com.senpure.base.AppEvn;
import com.senpure.io.generator.ui.UiBoot;

import java.util.Objects;

/**
 * OrangeBoot
 *
 * @author senpure
 * @time 2019-05-15 14:26:10
 */

public class OrangeBoot {



    public static void main(String[] args) {
        AppEvn.markClassRootPath();
        AppEvn.installAnsiConsole();
        if (Objects.equals(System.getProperty("silence"), "true")) {
            SilenceBoot.main(args);
        } else {
            UiBoot.main(args);
        }
    }



}
