
=begin
    Serie C: 
    2, -3, -5, -7, 4, 5, 6, -9, -11, -13, 8, 10, 12, -15, -17, -19, 14...
=end

#Validar entrada
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

valor_pos = 2
valor_neg = -3
valor = 0
cont_pos = 0
cont_principal = 0
pos = 0
neg = 0

#ENTRADA
print "n: "
cadena = gets.chomp

#Validar entrada
n = to_int(cadena)

if (n.instance_of? Integer) == true

    #Secuencia iterativa principal
    for i in 0..n-1 do
        #Contador numeros par positivos
        if valor_pos%2 == 0
            #Contador - imprimir numeros  positivos una vez
            for pos in 0..cont_pos do
                valor = valor_pos
                if cont_principal == n-1
                    print "#{valor}.\n"
					puts "Presiona ENTER para salir."
					gets.chomp
                    exit
                end
                print "#{valor}, "
                valor_pos += 2
                cont_principal+=1
            end
            cont_pos+=1
        end

        #Contador numeros  impar negativos
        if valor_neg%2 != 0
            #Contador - imprimir numeros negativos 3 veces
            for neg in 0..2 do
                valor = valor_neg
                if cont_principal == n-1
                    print "#{valor}.\n"
					puts "Presiona ENTER para salir."
					gets.chomp
                    exit
                end
                print "#{valor}, "
                valor_neg -= 2
                cont_principal += 1
            end
        end

    end


else
    puts "#{cadena} no es un valor entero."

end

puts "Presiona ENTER para salir."
gets.chomp