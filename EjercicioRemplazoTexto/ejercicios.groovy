/**
 * Created by YeshuaAntonio on 07/03/2015.
 */
/*
Crear un método que reciba una cadena de texto, para la cual debe reemplazar todas las letras 'o'
encontradas en la cadena de texto por 'x', e incrementar en cada ocurrencia una ‘x’ en la sustitución.
Ejemplo 1.
        Entrada: "Hola mundo".
        Salida: "Hxla mundxx".
        Ejemplo 2.
        Entrada: "Esto es otro ejemplo practico"
Salida: "Estx es xxtrxxx ejemplxxxx practicxxxxx".

*/

def reemplazoOs(String texto){
    def nuevoTxt = ""
    def tokens = texto.tokenize('o')
    tokens.eachWithIndex { it, i ->
        def eqis = ""
        def nvoke = i+1
        nvoke.times { eqis += "x"}
        nuevoTxt += it + eqis
    }
    nuevoTxt
}

println reemplazoOs("Esto es otro ejemplo practico")





