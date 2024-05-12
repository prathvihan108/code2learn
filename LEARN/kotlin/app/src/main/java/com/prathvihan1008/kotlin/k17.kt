/*
Delegations:
Inheritance implementation in classes and functions can be altered with the help of delegations techniques"

Object oriented languages support it innately without any boiler plate code.

Delegations is used in kotlin with the help of "by" keyword.
//it reduces the code

//delegations are mainly used in with the multiple interfaces
//they are used to delegate  the method call from an object to another object

 */
package com.prathvihan1008.kotlin

fun main(){

    val TaskManager=TaskManager(BgTask("task1"),BgExecute("task1"))//since task Manager takes the objects of type BgTask and BgExecute
   TaskManager.Create()
   TaskManager.Execute()

}

class BgTask(var taskName:String):Task{
    override fun Create() {

        println("Task "+taskName+" completed")
    }



}

class BgExecute(var taskName:String):ExecuteTask{
    override fun Execute() {
        println("Task "+taskName+" executing")
    }

}



interface  Task{
    fun Create()

}

interface ExecuteTask{
    fun Execute()

}

//class TaskManager(val creator:Task,val executor:ExecuteTask):Task,ExecuteTask{
//    override fun Create() {
//        creator.Create()
//    }
//    override fun Execute() {
//        executor.Execute()
//    }
//}
// in the above code we have a class TaskManager which implements the interfaces Task and ExecuteTask and also it accepts 2 parameters of the same classes
//this is redundant code since we can directly call the methods of the interfaces using delegations as shown below syntax
class TaskManager(val creator:Task,val executor:ExecuteTask)
    : Task by creator ,ExecuteTask by  executor
//creator and executor are the object of the classes which have implements the interfaces Task And Execute
//In the above code we can also use BgTask asn Bgexecute instead of the superclass reference variables Task and ExecuteTask
//since the "creator"is an object of the subclass we can reference it by either super class or subclass