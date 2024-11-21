package com.inheritance.shape;

public class Circle extends Shape{
      private int radius;
      
      public Circle(){
      
      }
      
      public Circle(int radius){
            this.radius = radius;
      }
      
      public int getRadius(){
            return radius;
      }      
      
      public double getArea(){
             return 3.14*radius*radius;
      }
      
      public int getPerimeter(){
             return 2*(int)3.14*radius;
      }
      
      public String toString(){
            return """
             %s
            | %-30s : %-5s |
            | %-30s : %.2f |
            | %-30s : %-5s |
             %s
            """.formatted("-".repeat(40),"Radius of the Circle is",getRadius(),"Area of the Circle is",getArea(),
                            "Perimeter of the Circle is",getPerimeter(),"-".repeat(40));          
     }       
}                    
            
      
            
