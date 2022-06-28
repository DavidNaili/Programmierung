# Zufallsgenerator
import random
random.seed()

# Werte und Berechnungen
a = random.randint(1,20)
b = random.randint(1,20)
c = a + b
print("Die Aufgabe:",a,"+",b)

# Eingabe
print("Bitte eine Zahl eingeben:")
z = input()
zahl = int(z)

# Verzweigung
if zahl == c:
    print(zahl, "ist richtig")
else:
    print(zahl, "ist falsch")
    print("Ergebnis: ", c)
