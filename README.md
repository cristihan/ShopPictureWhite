# ShopPictureWhite
Tenim una franquicia de botiga de quadres il·legals que fa veure que ven collarets blancs, per això es diu “white collar”. 

Aquesta franquicia té varies botigues, cadascuna amb un nom i una capacitat màxima de quadres (o collars^^).

Hi ha quadres que tenen un nom d’autor i d’altres que són anònims. Això sí, tots tenen un nom, un preu i una data d’entrada (és la data del moment en el que entra a la botiga).

El client ens demana implementar una API amb Spring amb les següents funcionalitats:

    • POST /shops/   
        ◦ Crear botiga: li direm el nom i la capacitat

    • GET /shops/  
        ◦ Llistar botigues: retorna la llista de botigues amb el seu nom i la capacitat

    • POST /shops/{ID}/pictures  
        ◦ Afegir quadre: li donarem el nom del quadre i el del autor

    • GET /shops/{ID}/pictures
        ◦ Llistar els quadres de la botiga

    • DELETE /shops/{ID}/pictures:
        ◦ Incendiar quadres: per si ve la policia, es poden eliminar tots els quadres de la botiga sense deixar rastre.
