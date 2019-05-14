# DesignPatterns
23个设计模式

#### 01_单例模式：  
&emsp;**作用：**一个类只有一个实例，并且提供一个访问实例的全局访问点。  
&emsp;**常见场景：**任务管理器，回收站，网站计数器。  
&emsp;**优点：**1、只生成一个实例，减少了系统性能开销。2、可以在系统设置全局的访问点，优化共享资源访问。  
  
&emsp;**饿汉式：**对象会立即加载   
&emsp;&emsp;static变量会在类装载时初始化，不会涉及多个线程对象访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题。因此，可以省略synchronized关键字。  
&emsp;&emsp;缺点：1、没有延迟加载。2、如果只是加载本类，而不是要调用getInstance()，甚至永远没有调用，则会造成资源浪费！  
    
&emsp;**懒汉式（使用synchronized同步）：**真正用的时候才加载！  
&emsp;&emsp;缺点：资源利用率高了。但每次调用getInstance()方法都要同步，并发效率较低。  
    
&emsp;**懒汉式（双重检验）：**提高了执行效率，只有在第一次使用时才同步  
&emsp;&emsp;缺点：由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题。不建议使用。  
    
&emsp;**懒汉式（静态内部类）：**外部类没有static属性，不会像饿汉式立即加载对象。只有调用了getInstance方法，才会加载静态内部类。加载类时时线程安全的。兼备了并发高效调用和延迟加载的优势。  
  
&emsp;**对比：**  
&emsp;&emsp;**主要：** 
&emsp;&emsp;&emsp;饿汉式（线程安全，调用效率高。 但是，不能延时加载。）  
&emsp;&emsp;&emsp;懒汉式（线程安全，调用效率不高。 但是，可以延时加载。）  
&emsp;&emsp;**其他：**  
&emsp;&emsp;&emsp;双重检测锁式（由于JVM底层内部模型原因，偶尔会出问题。不建议使用）  
&emsp;&emsp;&emsp;静态内部类式(线程安全，调用效率高。 但是，可以延时加载)  
&emsp;&emsp;&emsp;枚举式(线程安全，调用效率高，不能延时加载。并且可以天然的防止反射和反序列化漏洞！)  
&emsp;&emsp;**如何选用?**
&emsp;&emsp;&emsp;单例对象 占用 资源 少，不需要 延时加载：枚举式 好于 饿汉式  
&emsp;&emsp;&emsp;单例对象 占用 资源 大，需要 延时加载：静态内部类式 好于 懒汉式  

#### 02_工厂模式：  
&emsp;**作用：**实现了创建者和调用者的分离  
&emsp;**面向对象的基本原则：**
&emsp;&emsp;OCP（开闭原则）：对扩展开放，对修改关闭。  
&emsp;&emsp;DIP（依赖倒转原则）：针对接口编程，不要针对实现编程。  
&emsp;&emsp;LOD（迪米特法则）：一个类尽量少的依赖于其他类。  
&emsp;**简单工厂：**违反了开闭原则  
&emsp;&emsp;用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有代码）  

&emsp;**工厂方法：**  
&emsp;&emsp;为了避免简单工厂模式的缺点，不完全满足OCP。  
&emsp;&emsp;工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个工厂类，而工厂方法模式有一组实现了相同接口的工厂类。  

&emsp;**抽象工厂：**  
&emsp;&emsp;用来生产不同产品族的全部产品。（不可以增加产品，可以增加产品族）  
&emsp;&emsp;抽象工厂模式是工厂方法模式的升级版本，在有多个业务品种、业务分类时，通过抽象工厂模式产生需要的对象是一种非常好的解决方式。  

&emsp;**对比简单工厂和工厂方法：**  
&emsp;&emsp;简单工厂只需要一个工厂类，而工厂方法随着产品种类的增加，会增加工厂的个数。所以从结构上来看简单工厂更简单。  
&emsp;&emsp;简单工厂随着产品类的增加，就需要增加修改工厂类的方法。而工厂方法每个工厂类只负责单一的任务。所以从代码复杂成都来看，工厂方法更佳。  
&emsp;&emsp;根据设计理论而言建议：工厂方法。但一般写，都用简单工厂。  
