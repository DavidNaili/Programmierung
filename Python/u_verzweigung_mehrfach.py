""" Programm zur Berechnung des Steuerbeitrags anhand folgender Steuertabelle:
    Gehalt               Steuersatz
    mehr als 4.000 €     26%
    2.500 bis 4.000 €    22%
    weniger als 2.500 €  18% """


print("Geben Sie Ihr Bruttogehalt in Euro ein:")
bg = input()
bgr = float(bg)

if bg > "4000":
    st = bgr * 0.26
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
elif bg >= "2500" <= "4000":
    st = bgr * 0.22
    print("Es ergibt sich ein Steuerbetrag con", st, "Euro")
elif bg < "2500":
    st = bgr * 0.18
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
