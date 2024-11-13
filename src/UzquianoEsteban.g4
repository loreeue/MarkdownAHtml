grammar UzquianoEsteban;

axioma : (ENC_PRIMER | ENC_SEGUNDO | ENC_TERCERO | ENC_CUARTO | ENC_QUINTO | ENC_SEXTO | NEGRITA_ASTERISCOS | NEGRITA_GUIONES |  CURSIVA_ASTERISCOS | CURSIVA_GUIONES | CITAS | LINEAS | BLOQUES_CODIGO | URL_VALIDA | URL_NOVALIDA | LISTA | TEXTO_NORMAL | NEWLINE)+ EOF;

//----------------------------APROBADO-------------------------
//primer punto -> encabezados
ENC_PRIMER : '# '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H1>" + getText().substring(1).trim() + "</H1>");};
ENC_SEGUNDO : '## '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H2>" + getText().substring(2).trim() + "</H2>");};
ENC_TERCERO : '### '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H3>" + getText().substring(3).trim() + "</H3>");};
ENC_CUARTO : '#### '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H4>" + getText().substring(4).trim() + "</H4>");};
ENC_QUINTO : '##### '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H5>" + getText().substring(5).trim() + "</H5>");};
ENC_SEXTO : '###### '+ [a-zA-Z ]+ NEWLINE? {System.out.println("<H6>" + getText().substring(6).trim() + "</H6>");};

//segundo punto -> negrita y cursiva
NEGRITA_ASTERISCOS : '**' TEXTO_NORMAL '**' NEWLINE? {System.out.println("<SPAN class=\"bold\">" + getText().replace("**", "").trim() + "</SPAN>");};
NEGRITA_GUIONES : '__' TEXTO_NORMAL '__' NEWLINE? {System.out.println("<SPAN class=\"bold\">" + getText().replace("__", "").trim() + "</SPAN>");};

CURSIVA_ASTERISCOS : '*' TEXTO_NORMAL '*' NEWLINE? {System.out.println("<SPAN class=\"ital\">" + getText().replace("*", "").trim() + "</SPAN>");};
CURSIVA_GUIONES : '_' TEXTO_NORMAL '_' NEWLINE? {System.out.println("<SPAN class=\"ital\">" + getText().replace("_", "").trim() + "</SPAN>");};

//tercer punto -> citas
CITAS : '>' TEXTO_NORMAL NEWLINE? {System.out.println("<blockquote>" + getText().replace(">", "").trim() + "</blockquote>");};

//cuarto punto -> lineas separadoras horizontales
LINEAS : ('***' | '---' | '___') NEWLINE? {System.out.println("<HR/>");};

//quinto punto -> bloques de código
BLOQUES_CODIGO : '~~~' TEXT_AVANZADO '~~~' NEWLINE? {System.out.println("<code><pre>" + getText().trim().replace("~~~" ," ") + "</pre></code>");};

//----------------------------NOTABLE Y SOBRESALIENTE-------------------------
//primer punto sobresaliente -> urls correctas
URL_VALIDA : '[' TEXTO_NORMAL '](' CABECERA SEGMENTO_URL '.' SEGMENTO_URL ('.' SEGMENTO_URL)* ')' NEWLINE? {
    String texto_enlace = getText().substring(getText().indexOf('[') + 1, getText().indexOf(']'));
    String enlace = getText().substring(getText().indexOf('(') + 1, getText().indexOf(')'));
    System.out.println("<A HREF=\"" + enlace + "\">" + texto_enlace + "</A>");
};

//primer punto notable -> urls incorrectas
URL_NOVALIDA : '[' TEXTO_NORMAL '](' TEXTO_URLS ')' NEWLINE? {
    String texto_enlace = getText().substring(getText().indexOf('[') + 1, getText().indexOf(']'));
    String enlace = getText().substring(getText().indexOf('(') + 1, getText().indexOf(')'));
    System.out.println("<A HREF=\"" + enlace + "\">" + texto_enlace + "(URL aparentemente incorrecta)</A>");
};

//segundo punto sobresaliente -> listas no ordenadas
LISTA : (SUBLIST NEWLINE)+ {
    String[] lista = getText().split("\r\n");
    System.out.println("<UL>");
    for (String items : lista) {
        String it = items.replace("- ", "");
        String[] lineas = it.split("\n");
        for (String linea : lineas) {
            System.out.println("<LI>" + linea + "</LI>");
        }
    }
    System.out.println("</UL>");
};

//textos
TEXTO_NORMAL : [a-zA-Z ]+ NEWLINE? {System.out.println(getText().trim());};
TEXT_AVANZADO : RESTO {System.out.println(getText().trim());};
TEXTO_URLS: (~[\r\n])+ {System.out.println(getText());};

//para las urls
CABECERA: ('http://' | 'https://');
SEGMENTO_URL: [a-zA-Z0-9]+;

//para las listas
SUBLIST: '-' ~[\r\n]+;

//nueva linea
NEWLINE: ('\r'? '\n')+ -> skip;

//resto del fichero
RESTO: ~('~'|'#'|'*'|'_'|'>'|'-')+;