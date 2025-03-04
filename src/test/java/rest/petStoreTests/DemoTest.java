package rest.petStoreTests;

import com.fasterxml.jackson.databind.JsonNode;
import common.BaseTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import petStore.assertions.PetAssertions;
import petStore.models.builders.FakePetBuilder;
import petStore.models.builders.PetBuilder;
import petStore.models.petModel.Category;
import petStore.models.petModel.PetModel;
import petStore.сontrollers.PetController;

public class DemoTest extends BaseTest {


    @Test
    public void demoTest() {

//        PetModel pet = new PetBuilder().withRequiredFields(44l, new Category(), "test").build();
        JsonNode pet = new FakePetBuilder().withRequiredFields("dddd", "cat", "test").build();

//        PetModel pet1 = new PetModel(new ArrayList<>(), "generatedString", 6880758l, null, new ArrayList<>(), "test22");
//        PetModel pet2 = new PetModel(new ArrayList<>(), "generatedString", 6880758l, null, new ArrayList<>(), "test22");
//        PetModel pet3 = new PetModel(new ArrayList<>(), "buba3", 3, null, new ArrayList<>(), PetStatus.AVAILABLE.name().toLowerCase());

        PetController controller = new PetController();
        PetAssertions assertions = new PetAssertions();

       Response response = controller.addPet(pet);
       assertions.assertStatusCode(response, 200);
//       PetAssertions.assertStatusCode(responses, 200);
//        assertions.assertStatusCode405(responses);
//        System.out.println(responses);
//        System.out.println(responses.getContentType());
//        System.out.println(responses.getStatusLine());
//        System.out.println(responses.getTime());
//        System.out.println(responses.as(PetModel.class));
//        System.out.println(responses.as(JsonNode.class));
//       PetListController controller = new PetListController();
//        System.out.println(controller.addPet(pet));
//       controller.deletePet(pet.getId());
//       PetModel responses = controller.addPet(pet);
//       Assertions.assertEquals(pet, responses, "didn't get expected result");
//        System.out.println(controller.getPetById(pet.getId()));
//       controller.getPetsByStatus("test");
//        Object result = controller.getPetById("6880758");
//        String testdata = "" + "," + PetStatus.SOLD.name().toLowerCase()+ "," + "";

//        List<PetModel> list = controller.getPetsByStatus(PetStatus.SOLD.name().toLowerCase());
//        System.out.println(list.size());
//        Assertions.assertTrue(list.size() != 0);
//        Assertions.assertEquals(pet, testPet);
//        System.out.println(result);
//        controller.deletePet();
//        result = controller.getPetById();
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//        try {
//            Inventory test = new StoreController().getAllStoreInventory();
//        } catch (Exception e) {
//            Assertions.assertTrue(false,
//                    "\nDidn't get expected result."
//                            + "\nDeserialization failed."
//                            + "\nResponse doesn't match to expected json schema\n"
//                            + e.getMessage());
//        }
////////////////////////////////////////////////////////////////////////////////////////////////////////

//        new StoreController().getAllStoreInventoryList();

//
//        OrderModel order = new OrderModel(6880758l, 23, 3l, "2019-23-11", false, "доставка");
//        OrderModel order = new OrderBuilder().withRequiredFields(23l, 14l, 1, OrderStatus.APPROVED.name().toLowerCase(), true).build();
//        JsonNode fakeOrder = new FakeOrderBuilder().withRequiredFields("33", "33", "54", "333", "true").build();
//        StoreController storeController = new StoreController();
//        OrderModel responses = storeController.makeOrder(order);
//        System.out.println(responses);
//        System.out.println(storeController.getOrderById("23"));
//        storeController.deleteOrder("23");
//        System.out.println(storeController.getOrderById("23"));
//        storeController.makeOrder(fakeOrder);
//        storeController.getOrderById("33");
//        storeController.deleteOrder("33");
//        storeController.getOrderById("33");





    }

}

