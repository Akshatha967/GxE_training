package dayFive;
// 
//Java memory management
/*Heap memory
-Xms : to set initial java heap size
 -Xmx : to set maximum java heap size
during the object creation the space gets allocated
 Garbage collection is compulsory in heap memory.
*/

/*Method area : runtime constant pool
 * class variables, constructor variables, method are stored here
 * This may and may not be garbage collected 
 * 
 */

/*JVM stack
 * -Xss is used to set the size of the stack during the application startup.
 * created at the same time when the thread is created
 * 
 */

/*Native method stacks
 * Used when the application created uses some native technologies
 */

/*Program counter
 * Holds the address of instruction to be executed next.
 */

/* Types of JVM garbage collectors:
 * Serial GC
 * Parallel GC
 * Concurrent Mark Sweeo(CMS)
 * G1( Garbage first) GC
 * Epsilon GC
 * Shenandoah
 * ZGC
 */

/*Serial GC:
 * done using a single thread.
 * Used for applications that can withstand some small pauses.
 */

/*Parallel GC - default and is known as throughput collector.
 * Applicaton threads are paused, but there are multiple threads performing the GC operation.
 */

/*CMS 
 *  It is run along side an application.
 *  It uses  multiple threads for both minor and major GC.
 *  
 */

/*G1 (Garbage First) GC
 * G1 is parallel
 */

/*Epsilon GC
 * it's a do-nothing GC
 * Epsilon just manages memory allocation.It doesn't do any actual memory freeup.
 * Used only when you know the exact memory footprint of your application.
 */

/*
 * Introduced in JDK 12
 * It is a CPU intensive GC
 * It performs compaction, deleted unused objects, and release free space to the OS immediately. All of this happens in parallel 
 */

/*ZGC
 * It is designed for applications that have low latency requirements and use large heaps.
 * Allows java application to continue running while it performs all garbage collection operations.
 */


/*Memory leaks
 * The objects present in the heap that are no longer used, but the garbage collector is unable to remove them from  the memory.
 * Reasons: 
 * Memory leak through static fields
 * Unclosed resources - Database connections, streams , sessions 
 * Improper equals () and hashCode() implementations.
 * 
 */
public class MemoryMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
