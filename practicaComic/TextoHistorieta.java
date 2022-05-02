package practicaComic;

import imonsh.Screen;

import java.awt.*;

public class TextoHistorieta implements TextoDistribucion{
    String dialogos;

    @Override
    public void pagPortada(Screen s) {
        s.setVisible(true);
        dialogos = "\n\n\n\n\n\n\t  Sensatez y Censura";
        s.out(dialogos,"Comic Sans MS",34, Color.black);
    }

    @Override
    public void pagUno(Screen s) {
        s.cls();
        dialogos = "Bart: Y así es como Benjamin Franklin invento la electricidad. Tambien invento otra cosas utiles" +
                "como el odometro y Francia. Tambien...\n\nKrabappel: Bart. \n\nBart: no cree nada de esto, " +
                "¿verdad? \n\nKrabappel: deje de escuchar cuando le llamaste Benjie. \n\nSkinner: de verdad pensaste" +
                "que te ibas a salir con la tuya, Bart? Gracias a ti, ahora tu clase cree que Benjamin Franklin era un" +
                "maniatico vengativo con cinturon de hebilla gigante y enemigo de los arboles. \n\nSkinner: " +
                "!Esto se acabo! vas a preparar otro escrito bien documentado sobre la figura historica de tu eleccion..." +
                " Excluyendo al inventor del inodoro. \n\nBart: ¿Tomas S. Excremento? \n\nSkinner: !yo se quien invento el" +
                " inodoro simpson!";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDos(Screen s) {
        s.cls();
        dialogos = "Skinner: y para que nunca olvides tu trasgresión histórica, pensarás y entregarás dicho informe" +
                "junto con tu padre. Homero J Simpson. \n\nHomero: ¿Que tengo que hacer que?\n\nLenny: Homero, tienes que" +
                "usar un traje de radiación cuando entras a el nucleo.\n\nHomero; Lenny esas son solo sugerencias." +
                "\n\nHomero: Hola ¿Que pasa chico? ¿Que tengo que hacer qué?\n\nHomero: bueno, ¿Podemos hacerlo sobre el" +
                "tipo que invento el inodoro?  ¡OUCH!!\n\nHomero: ¿Que vamos hacer? ¿Que podemos hacer? ¡no se nada de " +
                "historia! ¡ni si quiera se en que condenado país vivimos! ¿Los estados unidos? ¿América? ¿Tierra de Lagos?" +
                "\n¡No quiero abrir los libros!¡no quiero abrr los libros! ¡No puedo respirar!\n\nBart: Papá se por lo que" +
                "estás pasando, pero no debes dejarte llevar por el pánico.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagTres(Screen s) {
        s.cls();
        dialogos = "TV: a partir de enero, el más esperado programa policial de la temporada...\nSoy el detective" +
                "Trastón y detecto los traseros!\n\nGorgory: ¡Rindete Flanders! sabemos que tienes el microchip!...\n" +
                "¿Si no porque nos llamaste, dijiste que lo robaste y nos diste instrucciones precisa de como llegar" +
                "a tu casa?\n\nHomero: llevame a tus comics y tus tarjetas de baseball.\n\nBast: Una parada más y" +
                "después nos ponemos a trabajar.\n\nHomero: Pero yo no quiero trabajar...";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagCuatro(Screen s) {
        s.cls();
        dialogos = "Bart: ¿Que es eso?\n\nJeff: Es mi sección 'solo para mayores'\nPara que sepas, es una de las muchas" +
                "urnas para votar de springfield que compré en una subasta municipal.\n\nHomero: ¡OHHH! ¡El amante de " +
                "Lady chatterly de clasicos ilustrado! ¡OHHH! ¡Las aventuras de la chica del escote! Hey ¡Un momento!\n" +
                "Éste es sobre Tomas Jefferson. ¡No sólo es para mayores! ¡Nunca ha sido solo para mayores!\n\n" +
                "Jeff: tienen en la mano el número 28 de comics histriónicos, Los cómics que amalgaman la historía y " +
                "el horror espeluznante, creo que el título de este mes es ¡Yo, Tomas Jefferson, caníbal! es solo" +
                "para lectores adultos.\n\nBart: ¿Tomas Jefferson fue un caníbal?";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagCinco(Screen s) {
        s.cls();
        dialogos = "Bart: ¡Eugene V. y su nefasto sindicato de vampiros! ¡Sepultados en vida por Elizabeth Cady Stanton!," +
                " ¡Nos sacamos la lotería, papá!, podría hacer ocho inforemes con este materíal.\n\nHomero: ¡Por supuesto" +
                "que es una buena idea Marge! el chico nunca ha estado tan interesado en las tareas escolares, deberían" +
                " dar un toque horripilante a todas las materias; metematicas descerebradas! ciencía espeluznante! " +
                "grámatica traumatizante!\n\nBart: ¿Con quién estás hablando, papá?\n\nHomero: pensé que era Marge. Bueno," +
                " tenía que decirlo.\n\nBart: Oye, Homero... ¿Por qué tenemos que limitarnos a sólo a un personaje histórico!" +
                " podríamos hacer una revisión general de la historía americana!\n\nHomero: buena idea, chico. Les " +
                "mostraremos que existen simpsons inteligentes, aparte de lisa con sus calculos complicados y palabras cultas.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagSeis(Screen s) {
        s.cls();
        dialogos = "Homero: Lo unico que debo de recordar es que George Washington decuartizo al vendedor de cerezas.\n\n" +
                "Skinner: aunque verte humillado delante de toda la escuela me daría una sensación de deber cumplido" +
                ", me alegra saber que haz estudiado, Bart...\nPorque he invitado a algunas personas importantes.\n\n" +
                "Homero: ¿Se supone que debemos estar austados o impresionados? ¡Dígales a esos líderes políticos y " +
                "religiosos que se preparen para que la historia les de una patada en el trasero!\n\n" +
                "Skinner: No me toques!\n\nHomero: Bueno.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagSiete(Screen s) {
        s.cls();
        dialogos = "Homero: La mayoría de ustedes ha crecido usando el dentrifico que 'ellos' querían que usaran. " +
                "Bebiendo lo que 'ellos' aseguran que ha ganado la competencía entre refrescos. Estudiando la historia" +
                "que 'ellos quieren que conozcan.\n¡Pero que pasaría si les decimos que 'ellos' no cuentan toda la historia!\n" +
                "Homero: por ejemplo, Cristóbal Colón no andaba buscando América cuando desembarcó en nustro bello " +
                "contiente en 1492. Lo que andaba buscando era una tierra con suelo rico en oxígeno para plantarse a " +
                "sí mismo y producir un ejercito!\nPorque Colón era realmente una criatura mitad hombre, mitad cebolla!" +
                "Él y su horrible ejército de cebollas se alimentaban chupando las espinas dorsales de inocentes serer" +
                "humanos!\n\nGorgory: dile adios a tu papito, jovencita. No lo veras por mucho tiempo.\n\nLisa: " +
                "¿Por que?¿De que se le acusa?\n\nGorgory: Después de que Lou lo golpeó con ese saco de arena de " +
                "25Kg, descubrimos que cargaba estos cómics encima.\n\nBart; ¿Y qué?\n\nGorgory: ¿Y qué? ¡Yo también " +
                "diría eso, si esos cómics no fueran obscenos!\nEn Springfield si vas a llamar a Cristobal Colón cebolla" +
                "devora-espinas dorsales, vamos a pasarte por la lupa...";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagOcho(Screen s) {
        s.cls();
        dialogos = "Homero: Bueno! Bueno! Lo reconozco! ¡Yo fui quien robó la cabeza nuclear de la exposición del" +
                "museo de Springfield!\n\nGorgory; Simpson, estamos hablando de algo grave! ¡Hablamos de cómics realmente" +
                "atrevidos!\n\nHomero: ¿Qué? ¿Mis cómics? ¿Me han arrastrado hasta aquí por mis cómics?\n\n" +
                "Lou: Entonces sí son tuyos.\n\nPolicia: Eh, Lou. Tienen una etiqueta que dice 'De la biblioteca" +
                "de Homero Simpson'.\n\nHomero: pero los compré para mí y para mi hijo.\n\nGorgory: ¡Simpson! Podría " +
                "cotarte fácilmente 80 años de carcel ¡Compra de material obsceno! ¡Lectura publica de material obsceno!" +
                "¡Empaque y almacenamiento de material obsceno con la esperanza de que aumente su valor!\n¿Donde conseguiste" +
                "esas cosas?\n\nHomero: ese lugar extraño con la cosa en el escaparate";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagNueve(Screen s) {
        dialogos = "Policia: ¡Todos afuera, excepto el fulano gordo!\n\nLou: arriba las manos, gracioso. Irás a la cárcel, " +
                "tú, tu pizza y tus comics escandalosos en cuatro colores.\n\nJeff: para que sepas la mayoría son en blanco" +
                " y negro. El restod de las revitas han sido coloreadas por un proceso Miraweb de avanzada...\n\nLou: " +
                "resérvalo para el juez, experto en calabozos.\n\nPolicía: revuelvan esto patas arriba, muchachos." +
                " Necitamos mas pruebas y el número de 'Bety y verónica' de este mes para el jefe. Al parecer tienen " +
                "algún tipo de problema amoroso con Archi.\n\nPolicía: ¡Oh, dios mío! ¡No!";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDiez(Screen s) {
        s.cls();
        dialogos = "Homero: ¿Y tú, por qué estas aquí?\n\nJeff: señor Simpson ¿Esta usted atrapado en universo paralelo?" +
                "¿Talvez uno en el que no es un autómata tarado? Los agentes de policía me trajeron aquí porque creen que " +
                "los cómics que le vendí eran obscenos.\n\nHomero: ¡Dios mío! Tambien te agarraron a ti!\n\nJeff: " +
                "señor Simpson, usted les dijo que fui yo. ¿Por qué no me dijo en primer lugar que estaba preparando un" +
                " informe de historia? ¡No le hubiera dado esa estupidez histrionica!";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagOnce(Screen s) {
        s.cls();
        dialogos = "Kent: Hola soy Kent Brookman y estoy enormemente dissustado. ¿El motivo de mi repulsión? Las " +
                "revistas de historietas.\nAntes eran un sagrado bastión de innocencía, que nos brindaban una felicidad " +
                "sensacionalista, no obscena por 5 centavos. Pero ahora, imaginensé si aquellos maravillosos chicos" +
                " Katzenjammer hubieran crecido para convertirse en cabezas rapadas y la dulce Nancy en una pr05#%&a barata..." +
                " Eso es lo que esta ocurriendo hoy día.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDoce(Screen s) {
        s.cls();
        dialogos = "Bart: Y no sé qué es más corrupto. Estos expertos en basura o nuestro sistema jurídico americano. " +
                "Éste es Kent Brookman, todavía dissutado, delante de la escuela primaria de Springfield.\n\n" +
                "Marge: Homero, ya hace casí uaa hora que haz salido de la cárcel puedes quitarte eso ahora. \n\n" +
                "Homero: pero es tan cómodo! ¡No ajusta en la cintura!\n\nBart: Homero, no entiendo, ¿Que hemos hecho mal?\n\n" +
                "Homero: bueno chicos, lo que hice fue comprar 18 números de cómics que el gobierno creé que son demasiado" +
                " repuganntes para que cualquier ser viviente los lea.\n\nBart: oyé ¿Estás diciendo que yo puedo escribir " +
                "algunas palabras y hacer unos dibujos tan repugnantes que sería un crimen solo mirarlos?\n\nHomero: Ajá.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagTrece(Screen s) {
        s.cls();
        dialogos = "Lisa: Papá, la primera enmienda de la constitucion de los estados unidos dice que el congreso no " +
                "sancionará ninguna ley que limite la libertd de palabra o la libertad de prensa.\nTu derecho " +
                "constitucional te permite comprar estos repugantes cómics, lo mismo que permite a Bart dibujar este...\n\n" +
                "Jeff: soy el dueño de android's dungeon y he venido a discutir la estrategía legal con mi coacusado.\n\n" +
                "Marge: Quién...\n\nJeff: despues de usar una caja matriz para lanzarme al futuro, pude tener acceso a los " +
                "records de lo que ocurrió en nuetro juicio. Luego pase un tiempo trabajando para la federación, " +
                "adquiriendo experiencía mientras juzgaba consejos de guerra.\nPor ultimo, usé un procedimiento " +
                "experimental con el sensor matriz de la sala del transportador, permitiendome ser retransmitido aquí, " +
                "a su salón.\nBueno, la puerta estaba entreabierta. Entonces, empecemos a trabajar.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagCatorce(Screen s) {
        s.cls();
        dialogos = "Jeff: desde los albores de la civilización, el gobierno a odiado las tiendas de cómics. No sólo los " +
                "cómics ayudan a fomentar una sed por la verdad y la justicía, sino que son también el foro de importantes " +
                "ideas, como ahora el clasico cuento del hombre radioactivo vs El Bon Vivant.\n\nLos abogados, los " +
                "funcionarios del gobierno, esa espantosa organización de 'Viva la gente', conozco sus tacticas. " +
                "son un monton de supersticiosos, cobardes, endebles gallinas, todos sin excepción. Si ellos no se " +
                "limitan a luchar en la sala del tribunal, tampoco lo haremos nosotros.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagQuince(Screen s) {
        s.cls();
        dialogos = "Homero: ¡No podemos rendirnos todavía! yo tengo una famiia y Moe en que pensar, y tu tienes tu legión " +
                "de zoquetes con granos en la cara, Si estan usando la Tv en contra de nosotros, ¿Por qué no la " +
                "usamos en contra de ellos?\nPondremos un anuncio con rock clásico di-na-mi-ta y chicas en bikini " +
                "y cocodrilos parlante que digan, 'Homero J Simpson y el tipo dueño del kiosco de revistas de historietas " +
                "no son unos pervertidos! \n\nJeff: esa es una buena idea, pero necesitamos dinero.\n" +
                "Voy a pedir ayuda financiera a los editores de cómics histrionicos. Despues de todo, ellos son quienes " +
                "nos metieron en este lío.\n\nJeff: negaron haber publicado las revistas.\n\nHomero: entoncés no podemos" +
                " poner el anuncio.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDieciseis(Screen s) {
        s.cls();
        dialogos = "Juez: Buenos días a todos. El tribunal está ahora en sesión, antes de empezar quisiera agradecer a " +
                "'Springfield por niños y familias y mascotas bien educadas', por la hermosa cesta de frutas que me han" +
                "traído está mañana.\n\nReligiosos: ¡Cuelgelos bien alto su señoría!\n\nJuez: Bueno, depende del jurado, " +
                "pero veré lo que puedo hacer. Defensa, empiece con su exposición inicial.\n\nJeff: señor Simpson " +
                "preparece para quedar estupefacto.\nHumanos enclenques. ¿Cuándo van a aprender? Hulk mas fuerte, Hulk " +
                "mas inteligente, Hulk los aplastara.\nPor supuesto que no soy el Hulk, el Hulk es la verdad y ustedes " +
                "son los humanos enclenques. ¡Para peor, son humanos enclenques que se han engañado a si mismos, creyendo " +
                "que son aptos para pronunciar sentencía como los guardianes de la galaxia Galactus, o el mismo Klaatu!\n\n" +
                "¿Es que ninguno tiene prejuicios? ¡Como si estuvieran protegidos de este mundo por sus propios tanques " +
                "Bacta, a salvo de la influencía de Rancors y Yambars que seguramente les nublan el juicio!\n" +
                "Ustedes no son observadores imparciales, ni siquiera Beyonders. Son skrulls, cylons y miembros del " +
                "imperio draconiano, viciados en su disposición y sus patrones de pensamiento.\n\nJurado1: Su señoría, " +
                "vamos a necesitar algún tipo de traducción.\n\nJurado2:Eso fue Klingon para decir,'Nosostros podemos traducir" +
                " su señoría'. ";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDiecisiete(Screen s) {
        s.cls();
        dialogos = "Lisa: Bart, he estudiado los casos desde federales a locales y creo que estamos en problemas.\n\n" +
                "Bart: Lisa, ¿De qué valen tus extraordinarias aptitudes de investigadora y extenso vocabulario si no " +
                "puedes librar a papá de esos cargos de obscenidad?\n\nJeff: señor Simpson, el juicio no va bien. No le " +
                "caemos bien al juez ni al jurado, y la estenógrafa la arrojó la maquina de escribir mientras usted " +
                "protestaba declaración, creo que necesitamos una estrategía, y por suerte tengo una.\n\nHomero: ¡Ella " +
                "dijo, que se le escapó! ";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDieciocho(Screen s) {
        s.cls();
        dialogos = "Marge: ¡Homero, huír a Costa Rica no es la solución!\n\nHomero: ¡Allí hay toda clase de fábricas americanas!" +
                " ¡Fábricas de automóviles, ¡Fábricas de sopa enlatada, de banderas americanas! ¡Conseguiré un trabajo y " +
                "cuando esté instalado enviaré por ti!\n\nBart: Creo que tenemos una defensa.\n\nJuez: durante el juicio, la " +
                "defensa ha enfermado, enfadado y mortificado al jurado, además de causar que se reventara el apéndice de uno " +
                "de sus miembros. Ahora, quieren que un niño de 10 años presente la exposición final.\n\nBart: Miembros del " +
                "jurado, ante ustedes... estoy yo, un zoquete.\nSabían ustedes que aún se publican cómics cuando pasaron a " +
                "integrar el jurado? ¿Ha estado alguno de ustedes en un kiosko de cómics? miembros del jurado, ¿Saben al " +
                "menos quién es Bolthead? ¿Y Abin-sur? ¿Y el hermano Yudú? No esperen la traducción, limítense a contetar " +
                "la pregunta!\n\nJurado: ¿Quién dice que no conozco los cómics? ¡Ahrr! ¡Me críe con las divertidas aventuras de" +
                " Garfield y odie!";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagDiecinueve(Screen s) {
        s.cls();
        dialogos = "Bart: Su señoría, según mi hermanita. nuestro sistema judicial, está basado en el derecho del acuerdo a ser" +
                " juzgado por un jurado de sus semejantes, señor juez, insisto en que ninguno de los miembros de este jurado son " +
                "'Semejantes' de los acusados!\n\nJuez: según la ley de Springfield, inciso 'juzgar sobre la marcha', yo " +
                "diría que... bueno, le daremos una oportunidad a los zoquetes.\n\n\nJurado Nuevo: nosotros, el jurado, " +
                "decidimos que los acuados son... Inocentes de todos los cargos de obscenidad.\n\nHomero: ¡Lo lograste, chico." +
                " Lo lograste!";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }

    @Override
    public void pagVeinte(Screen s) {
        s.cls();
        dialogos = "Jurado: No obstante, el jurado decidió poner cargo adicionales que, aunque inconstitucionales, están " +
                "permitidos en varios planetas de la federación.\nAcusado número 1, pongase de pie.\n\nLo hallamos culpable " +
                "de condescendencía, arrugar las cubiertas de las revistas, inflar precios, utilizar carteles altamnente " +
                "mordaces, vender cómics manchados con grassa de burritos, arruinar el final de 'la muerte de superman' y " +
                "sobornar al gerente del pasillo de la tienda de juguetes'Try & Save' para comprar todas las nueva figuras " +
                "de acción.\n\nAcusado número 2, lo hallamos culpable de llamar a la revista MAD revista de historietas, " +
                "citar a batman y robin como su favorita de la serie y, durante el curso de este juicio, referirse repetidamente " +
                "al jurado como el rincon de los zoquetes y exponernos a todos a sus zancadillas.\n\nPor estos pecados contra " +
                "nuestras más sagradas creencia, condenamos a los dos a... ¡SER COLGADOS EN PUBLICO!\n\n\nHomero: Que calor " +
                "hace. No sé tú, pero yo me voy a quitar los pantalones.";
        s.out(dialogos,"Comic Sans MS",18, Color.black);
    }
}
