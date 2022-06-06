/**
 * A fat interface can contain many methods. A class that implements the interface may not need all these methods.
 * Why does the interface contain all these methods? One possible answer is to support some of the implementing classes
 * of this interface. The Interface Segregation Principle (ISP) suggests that you don't pollute an interface with these
 * unnecessary methods only to support one (or some) of the implementing classes of this interface.
 * ISP: <b>a client should not depend on a method that it does not use.</b>
 */
package learn.dp.jdpexamples.c01solid.isp;
