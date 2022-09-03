package kz.aiknn.petclinic.services;

import kz.aiknn.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
