
### @Annotations

**@Test**

The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. Any exceptions thrown by the test will be reported by JUnit as a failure. If no exceptions are thrown, the test is assumed to have succeeded.

@BeforeClass

@AfterClass

@Before

@After

@Ignore

**@RunWith**

When a class is annotated with @RunWith or extends a class annotated with @RunWith, JUnit will invoke the class it references to run the tests in that class instead of the runner built into JUnit.


@Suite.SuiteClasses

### Exercises:
Cover the following code with JUnit tests
[`anagrams`](http://www.java2s.com/Code/Java/Collections-Data-Structure/Anagrams.htm)
[`http parser`](http://www.java2s.com/Code/Java/Network-Protocol/HttpParser.htm)

##### Additional
[`Here`](http://www.java2s.com/Code/Java/) you can find more code to cover with JUnit tests.
