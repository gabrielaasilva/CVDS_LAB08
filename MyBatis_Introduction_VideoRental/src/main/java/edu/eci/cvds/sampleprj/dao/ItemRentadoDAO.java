package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.samples.entities.ItemRentado;

import java.util.List;

public interface ItemRentadoDAO {
    /**
     * Metodo que consulta todos los Items rentados de la base de datos
     * @return Lista de todos los item rentados
     */
    public List<ItemRentado> load()throws PersistenceException;

    /**
     * Metodo que consulta los items rentados por un cliente especifico
     * @return List<ItemRentado> lista de los items rentados por un cliente
     */
    public List<ItemRentado> consultarItemsRentados(long idCliente) throws PersistenceException;

    /**
     * Metodo que consulta la informacion de un item que ha sido rentado
     * @return ItemRentado, informacion de la renta del item
     */
    public ItemRentado consultarItemRentado( int  idItem ) throws PersistenceException;


}