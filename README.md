# JavaPattern

### 1.工厂模式（Factory Pattern）

#### 1.1.简单工厂模式（Simple Factory Pattern）
简单工厂模式不是一个正式的设计模式，但它是工厂模式的基础。它使用一个单独的工厂类来创建不同的对象，根据传入的参数决定创建哪种类型的对象。
![img.png](src/main/resources/imgs/img.png)
#### 1.2.多个工厂方法模式（method factory pattern）
是对普通工厂模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
![img_1.png](src/main/resources/imgs/img_1.png)

#### 1.3.静态工厂方法模式（static method factory pattern）
将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
