#Validar valor entero
def to_int(string)
    Integer(string)
rescue ArgumentError
    nil
end

resultado = 0

print "n => " 
cadena = gets.chomp

if cadena
    n = to_int(cadena)
    for i in 1..n do
        formula = i**(2*i - 1)
        resultado = formula

        if i == n 
            puts "#{resultado}."
			puts "Presiona ENTER para salir."
			gets.chomp
            exit
        else
            puts "#{resultado}, "
        end
    end

else
    puts "Valor invalido."
end

puts "Presiona ENTER para salir."
gets.chomp