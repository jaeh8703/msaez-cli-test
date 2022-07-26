package petstore.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import petstore.domain.*;

@Component
public class PetHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Pet>> {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/feed")
                .withRel("feed")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/groom")
                .withRel("groom")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/comb")
                .withRel("comb")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test1")
                .withRel("test1")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test2")
                .withRel("test2")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test3")
                .withRel("test3")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/test4")
                .withRel("test4")
        );

        return model;
    }
}
