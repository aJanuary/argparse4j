/*
 * Copyright (C) 2011 Tatsuhiro Tsujikawa
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.sourceforge.argparse4j.inf;

import net.sourceforge.argparse4j.ArgumentParsers;

/**
 * <p>
 * This interface defines Subparsers which used to add {@link Subparser}.
 * </p>
 * <p>
 * {@link Subparser} is used to add sub-command to {@link ArgumentParser}.
 * </p>
 * 
 */
public interface Subparsers {

    /**
     * Adds and returns {@link Subparser} object with given sub-command name.
     * 
     * @param command
     *            Sub-command name
     * @return {@link Subparser} object.
     */
    Subparser addParser(String command);

    /**
     * <p>
     * Adds and returns {@link Subparser} object with given sub-command name and
     * addHelp.
     * </p>
     * <p>
     * For {@code addHelp}, see
     * {@link ArgumentParsers#newArgumentParser(String, boolean, String)}.
     * </p>
     * 
     * @param command
     *            Sub-command name
     * @param addHelp
     *            If true, {@code -h/--help} are available. If false, they are
     *            not.
     * @return {@link Subparser} object
     */
    Subparser addParser(String command, boolean addHelp);

    /**
     * <p>
     * Adds and returns {@link Subparser} object with given sub-command name,
     * addHelp and prefixChars.
     * </p>
     * <p>
     * For {@code addHelp}, see
     * {@link ArgumentParsers#newArgumentParser(String, boolean, String)}.
     * </p>
     * 
     * @param command
     *            Sub-command name
     * @param addHelp
     *            If true, {@code -h/--help} are available. If false, they are
     *            not.
     * @param prefixChars
     *            The set of characters that prefix optional arguments.
     * @return {@link Subparser} object
     */
    Subparser addParser(String command, boolean addHelp, String prefixChars);

    /**
     * Sets the name of attribute which the selected command name is stored.
     * 
     * @param dest
     *            The name of attribute the selected command name is stored.
     * @return this.
     */
    Subparsers dest(String dest);

    /**
     * Sets the text to display in the help message for sub-commands.
     * 
     * @param help
     *            The text to display in the help message.
     * @return this
     */
    Subparsers help(String help);

    /**
     * <p>
     * Sets the text to display as a title of sub-commands in the help message.
     * </p>
     * <p>
     * If either title or description({@link #description(String)}) is
     * specified, sub-command help will be displayed in its own group.
     * </p>
     * 
     * @param title
     *            The text to display as a title of sub-commands
     * @return this
     */
    Subparsers title(String title);

    /**
     * <p>
     * Sets the text to display to briefly describe sub-commands in the help
     * message.
     * </p>
     * <p>
     * If either description or title({@link #title(String)}) is specified,
     * sub-command help will be displayed in its own group.
     * </p>
     * 
     * @param description
     *            The text to display to briefly describe sub-commands
     * @return this
     */
    Subparsers description(String description);
}