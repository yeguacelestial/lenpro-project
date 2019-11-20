=begin
    Serie B
    -1, 2, 2, -3, 4, 4, 4, -5, 6, 6, 6, 6, -7...
=end

#VALIDAR ENTERO DE N
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

#INICIO DEL PROGRAMA

#VARIABLES
val_neg = -1
val_pos = 2
cont_principal = 0
cont_pos = 3

#LECTURA
print "n: "
cadena = gets.chomp

#Pasar a entero
n = to_int(cadena)

#Comparar tipo de archivo convertido
if (n.instance_of? Integer) == true

    #SECUENCIA ITERATIVA PRINCIPAL
    for i in 0..n-1 do
        #NUMEROS IMPARES NEGATIVOS
        if val_neg%2 != 0
            valor = val_neg
            if i==n-1
                print "#{valor}.\n"
                exit
            end
            print "#{valor}, "
            val_neg -= 2
            cont_principal += 1
        end

        #NUMEROS PARES POSITIVOS
        if val_pos%2 == 0
            for cantidad_pos in 0..cont_pos-1 do
                #REPETIR EL VALOR ANTES DE AUMENTAR
                for ineg in 0..cont_pos-1 do
                    valor = val_pos

                    if ineg == cont_pos-1
                        valor = val_neg
                        val_neg -= 2
                    end

                    if cont_principal == n-1
                        print "#{valor}.\n"
						puts "Presiona ENTER para salir."
						gets.chomp
                        exit
                    end

                    print "#{valor}, "
                    cont_principal += 1
                end

                #Aumentar dos unidades del valor
                val_pos += 2
                cont_pos += 1
            end
        end

    end

    
else
    puts "#{cadena} no es un valor entero."
end

puts "Presiona ENTER para salir."
gets.chomp