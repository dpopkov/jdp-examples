/**
 * SRP - Single Responsibility Principle.
 *
 * A class acts like a container that can hold many things such as data, properties, or
 * methods. If you put in too much data or methods that are not related to each other,
 * you end up with a bulky class that can create problems in the future. Let’s consider an
 * example. Suppose you create a class with multiple methods that do different things.
 * In such a case, even if you make a small change in one method, you need to retest the
 * whole class again to ensure the workflow is correct. Thus, changes in one method can
 * impact the other related method(s) in the class. This is why the single responsibility
 * principle opposes this idea of putting multiple responsibilities in a class. It says that
 * <b>a class should have only one reason to change</b>.
 *
 * You can divide a big problem into smaller chunks based on different responsibilities
 * and put each of these small parts into separate classes.
 * The next question is, what do we mean by responsibility?
 * In simple words, <b>responsibility is a reason for a change</b>.
 */
package learn.dp.jdpexamples.c01solid.srp;
