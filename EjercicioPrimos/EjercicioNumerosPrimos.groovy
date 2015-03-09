/**
 * Created by YeshuaAntonio on 06/03/2015.
 */
println System.currentTimeMillis()

100.times{
    def flag = false
    for(int i=2;i< it;i++)
    {
        if(it%i==0)
            flag = true
    }
    if(!flag)
        println "es primo: ${it}"
}
/*
100.times { i ->
if(i > 3)
    println(i.step(2))
else
    println i
}
*/
println  System.currentTimeMillis()