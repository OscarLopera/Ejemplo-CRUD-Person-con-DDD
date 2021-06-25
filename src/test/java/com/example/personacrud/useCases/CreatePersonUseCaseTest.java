package com.example.personacrud.useCases;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

@RunWith(MockitoJUnitRunner.class)
public class CreatePersonUseCaseTest {

    @Autowired
    private CreatePersonUseCase usecase;


    @InjectMocks
    private CrudRepository crudRepository;


    @Test
    public void createPersonTest(){
       /*   Mockito.when(crudRepository.save(any())).thenReturn(new Person(PersonId.of("123"), new Name("Oscar"), new Phone("3124745"),
                new IsProfessional(Boolean.TRUE)));

        var command = new CreatePerson( PersonId.of("123"), new Name("Oscar"), new Phone("3124745"),
                new IsProfessional(Boolean.TRUE));

        PersonCreated personCreated = executedUseCase(command);

        Assertions.assertEquals("123", personCreated.personId().value());*/
        System.out.println("dshgafjwd");
    }

    /*private PersonCreated executedUseCase(CreatePerson command){
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var PersonCreated = (PersonCreated) events.get(0);
        return PersonCreated;
    }*/
}