package com.atqc1;

    public class Cat extends Pet implements Training{
         Cat(String price) {
            super(price);
        }

        public void petSound() {
             System.out.println("Meow-meow!");
        }

       @Override
        public void walk() {
             System.out.println("I can walk with you if you put a leash on me!");
       }

       public void training () {
             System.out.println("I don't want to training! I want lie and eat all day!");
       }
    }

