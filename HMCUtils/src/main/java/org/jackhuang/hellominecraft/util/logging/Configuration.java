/*
 * Hello Minecraft!.
 * Copyright (C) 2013  huangyuhui <huanghongxun2008@126.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hellominecraft.util.logging;

import java.util.ArrayList;
import org.jackhuang.hellominecraft.util.logging.appender.ConsoleAppender;
import org.jackhuang.hellominecraft.util.logging.appender.IAppender;
import org.jackhuang.hellominecraft.util.logging.layout.DefaultLayout;

/**
 *
 * @author huangyuhui
 */
public class Configuration {

    public ArrayList<IAppender> appenders = new ArrayList<>();

    public static final Configuration DEFAULT;

    static {
        DEFAULT = new Configuration();
        DEFAULT.appenders.add(new ConsoleAppender("Console", new DefaultLayout(), true, new ConsoleAppender.SystemOutStream(), true));
    }

}
