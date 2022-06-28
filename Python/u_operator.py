""" Programm zur Berechnung des Steuerbeitrags anhand folgender Steuertabelle:
    Gehalt                      Familienstand             Steuersatz
    mehr als 4.000 €            ledig                     26%
    mehr als 4.000 €            verheiratet               22%
    kleiner oder gleich 4.000 € ledig                     22%
    kleiner oder gleich 4.000 € verheiratet               18% """


print("Bitte geben Sie Ihren Familienstand ein:")
fs = input()
fs1 = 'ledig'
fs2 = 'verheiratet'

print("Geben Sie Ihr Bruttogehalt in Euro ein:")
bg = input()        # bg  - Bruttogehalt
bgr = float(bg)     # bgr - setzung der Zahl auf Nachkommastellen

if bg > "4000" and fs == fs1:
    st = bgr * 0.26
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
elif bg > "4000" and fs == fs2:
    st = bgr * 0.22
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
elif bg <= "4000" and fs == fs1:
    st = bgr * 0.22
    print("Es ergibt sich ein Steuerbetrag con", st, "Euro")
elif bg <= "4000" and fs == fs2:
    st = bgr * 0.18
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
