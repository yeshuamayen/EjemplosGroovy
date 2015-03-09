/**
 * Created by YeshuaAntonio on 06/03/2015.
 */
/*
3   8   8   8

            I 1
            V 5
        X 10
        L 50
    C 100
    D 500
M 1000
1..3
4
5
6..8
9

*/

def conver2Roman(Integer num){
    if(num < 1 || num > 3888)
    {
        println "El numero ${num} es incorrecto, solo se aceptan numeros en rango 1..3888"
        return
    }
    def numS = num.toString()
    def chars = numS.chars.toList()
    def res = []
    def listDecimal = [[1 : 'I', 4 :'IV', 5 : 'V', 9: 'IX'],[1 : 'X', 4 :'XL', 5 : 'L', 9: 'XC'],[1 : 'C', 4 :'CD', 5 : 'D', 9: 'CM'],[ 1 : 'M']]
    chars.reverse().eachWithIndex { number, i ->
        def mapRom = listDecimal[i]
        def numeric = number.toString().toInteger()
        switch (numeric){
            case 0:
                break
            case 9:
                res.push(mapRom.get(9))
                break
            case 6..8:
                numeric.downto(6){res.push(mapRom.get(1))}
                res.push(mapRom.get(5))
                break
            case 1..4:
                numeric.downto(1){res.push(mapRom.get(1))}
                break
            default:
                res.push(mapRom.get(numeric))
        }
    }
    res.reverseEach {print it}
}

def conver2Dec(String romanik) {
    def listRomanos = [I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000]
    def chars = romanik.chars.toList(),seudo = [],resultado = 0, flag = true
    chars.each {
        def key = it.toString()
        if (listRomanos.get(key) == null)
            flag = false
        seudo.push(listRomanos.get(key))
    }
    if (!flag)
        println "el numero es invalido"
    else {
        seudo = seudo.reverse()
        for (i = seudo.size() - 1; i > 0; i--)
            resultado = operacionNumero(seudo[i], seudo[i-1], resultado)
    }
    println resultado + seudo.first()
}

def operacionNumero(actual, anterior, resultado) {

}


'C M L C I X'


conver2Dec('MMMDCCCLXXXVIII')
conver2Roman(3888)


