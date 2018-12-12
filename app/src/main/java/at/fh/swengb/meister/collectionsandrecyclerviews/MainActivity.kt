package at.fh.swengb.meister.collectionsandrecyclerviews

import Classes.Student
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val students = mutableListOf<Student>(
            Student("Klaus", 1),
            Student("Daniel", 1),
            Student("Laurin", 1),
            Student("Lili", 3),
            Student("Franz", 3)
        )

        Log.i("ue5", students.get(3).name)

        students.add(Student("Nikolaus", 3))

        for (s in students) {
            Log.i("ue5", s.name)
        }

        val set = setOf<Student>(
            Student("Christoph", 3),
            Student("Kevin",3),
            Student("Christoph", 3),
            Student("Kevin",3),
            Student("Me", 3)
        )

        for (s in set) {
            Log.i("ue5", s.name)
        }

        val students2 = mutableSetOf<Student>(
            Student("Rob", 2),
            Student("Daniel", 1),
            Student("Laurin", 1),
            Student("Lili", 3),
            Student("Franz", 3)
        )
        students2.add(Student("Rob", 2))
        students2.add(Student("Bob", 4))

        for (s in students2) {
            Log.i("ue5", s.name + " " + s.currentSemester)
        }


            for (s in students2) {
                if(s.name == "Rob")
                Log.i("ue5", s.name + " " + s.currentSemester)
            }

        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        for((key,  listofstutents) in studentMap) {
            for (s in listofstutents)
            Log.i("ue5", s.name + " " + s.currentSemester+" "+ key)
        }

        val toMutableMap = studentMap.toMutableMap()
        val ima16List = listOf(Student("Tyrion2", 1), Student("Jon2", 1))

        toMutableMap.put("IMA16", ima16List)

        for((key,  listofstutents) in toMutableMap) {
            for (s in listofstutents)
                Log.i("ue5", s.name + " " + s.currentSemester+" "+ key)
        }

    }
}
