# Descrição do Calculo
valorHamburguer = float(input("Valor do Hamburguer: "))
quantidadeHamburguer = int(input("Quantidade de Hamburguer: "))
valorBebida = float(input("Valor da Bebida: "))
quantidadeBebida = int(input("Quantidade de Bebida: "))
valorPago = float(input("Valor a Ser Pago: "))

# Calcula o valor total dos hambúrgueres e das bebidas
totalHamburgueres = valorHamburguer * quantidadeHamburguer
totalBebidas = valorBebida * quantidadeBebida

# Calcula o preço total do pedido
precoTotal = totalHamburgueres + totalBebidas

# Calcula o troco necessário
troco = valorPago - precoTotal

# Imprime a saída formatada
print(f"O preço final do pedido é R$ {precoTotal:.2f}. Seu troco é R$ {troco:.2f}.")