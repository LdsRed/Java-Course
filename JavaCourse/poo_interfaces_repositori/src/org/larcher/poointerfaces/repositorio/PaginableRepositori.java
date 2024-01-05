package org.larcher.poointerfaces.repositorio;

import org.larcher.poointerfaces.modelo.Cliente;
import java.util.*;
public interface PaginableRepositori {
    List<Cliente> listar(int desde, int hasta);
}
