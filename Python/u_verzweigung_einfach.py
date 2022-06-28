print("Geben Sie Ihr Bruttogehalt in Euro ein:")
bg = input()
bgr = float(bg)

if bg >= "2500":
    st = bgr * 0.22
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")
if bg < "2500":
    st = bgr * 0.18
    print("Es ergibt sich ein Steuerbetrag von", st, "Euro")


