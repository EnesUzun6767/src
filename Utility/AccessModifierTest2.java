package Utility;

import day34_GarbageCollection_AccesModifiers.AccessModifier;
public class AccessModifierTest2 {
    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData);
       // System.out.println(AccessModifier.defaultData);it can not be defined different packages.
        // System.out.println(AccessModifier.privateData)it can not both different class and package.
   AccessModifier.method1();
  // AccessModifier.method2();
 //  AccessModifier.method3();

    }


}
