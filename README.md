# 1.semUnitTestDemo

## Demo af Calculator sum metode.

Sum metode, der skal testes:

```java
  public int sum(int num1, int num2) {
    if (num1 > 100 || num2 > 100) {
       throw new IllegalArgumentException();
    }
    return num1 + num2;
 }
```
Test Eksempel 1: 

```java
 @Test
 public void testSum_WithPositiveIntegers() {
   //Arrange
   Calculator calculator = new Calculator();
   int expected = 30;
  
   //Act
   int result = calculator.sum(10,20);
   
   //Assert
   assertEquals(expected, result);
 }
```

<div>Test eksempel 2, hvor vi forventer at sum metoden kaster en IllegalArgumentException </div>

```java
 @Test
 public void testSum_WithTooLarge_Integers() 
    //Arrange
   
   Calculator calculator = new Calculator();
   //Act + Assert
   assertThrows(IllegalArgumentException.class, () -> calculator.sum(101,201));
}
```
 
