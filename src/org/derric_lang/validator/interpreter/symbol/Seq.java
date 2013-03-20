package org.derric_lang.validator.interpreter.symbol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.derric_lang.validator.interpreter.Interpreter;

public class Seq extends Symbol {
    
    private final List<Symbol> _symbols;
	
	public Seq(ArrayList<Symbol> symbols) {
	    _symbols = symbols;
	}

    @Override
    public boolean parse(Interpreter in) throws IOException {
        if (allowEOFSet() && in.getInput().atEOF()) {
            return _allowEOF;
        }
        in.getInput().mark();
        for (Symbol s : _symbols) {
            if (!s.parse(in)) {
                in.getInput().reset();
                return false;
            }
        }
        return true;
    }

}
