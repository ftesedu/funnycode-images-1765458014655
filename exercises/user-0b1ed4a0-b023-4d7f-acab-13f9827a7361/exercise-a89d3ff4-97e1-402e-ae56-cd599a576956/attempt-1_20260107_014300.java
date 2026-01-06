package vn.tayjava.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import vn.tayjava.configuration.Translator;
import vn.tayjava.dto.request.UserRequestDTO;
import vn.tayjava.dto.response.ResponeSuccess;
import vn.tayjava.dto.response.ResponseData;
import vn.tayjava.dto.response.ResponseError;
import vn.tayjava.exception.ResourceNotFoundException;
import vn.tayjava.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
@Tag(name = "User Controller")
public class UserController {

    @Autowired
    private UserService userService;

    // C1: Define response example directly in the annotation
//    @Operation(summary = "Create new user", description = "Create new user with the provided information", responses = {
//            @ApiResponse(responseCode = "201", description = "User created successfully",
//            content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
//            examples = @ExampleObject(
//                    name = "Create User Success Example",
//                    summary = "A sample response for successful user creation",
//                    value = """
//                            {
//                              "status": 201,
//                              "message": "Create User Successfully",
//                              "data": 1
//                            }
//                            """
//            ))),
//    })
    // C2
    @Operation(summary = "Create new user", description = "Create new user with the provided information")
    @PostMapping("/")
    public ResponseData<Integer> addUser(@Valid @RequestBody UserRequestDTO user) {
       System.out.print("User DTO: " + user);
      try {
          userService.addUser(user);
          return new ResponseData<>(HttpStatus.CREATED.value(), Translator.toLocale("user.add.success"), 1);
      } catch (ResourceNotFoundException e) {
              return new ResponseError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
      }
    }

    // C1: Define response example directly in the annotation
//    @Operation(summary = "Create new user", description = "Create new user with the provided information", responses = {
//            @ApiResponse(responseCode = "202", description = "Update successfully",
//                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            examples = @ExampleObject(
//                                    name = "Create User Success Example",
//                                    summary = "A sample response for successful user creation",
//                                    value = """
//                            {
//                              "status": 201,
//                              "message": "Create User Successfully",
//                              "data": 1
//                            }
//                            """
//                            ))),
//    })
    @Operation(summary = "Update user", description = "Update user information by user ID")
    @PutMapping("/{userId}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseData<?> updateUser(@PathVariable("userId") @Min(1) int userId , @RequestBody UserRequestDTO userDTO) {
        System.out.println("User ID: " + userId);
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "Update User Successfully");
    }

    @Operation(summary = "Patch user", description = "Patch user status by user ID")
    @PatchMapping("/{userId}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseData<?> patchUser(@PathVariable("userId") int userId, @RequestParam(required = false) boolean status) {
        System.out.println("Status: " + status);
        System.out.println("User ID: " + userId);
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "Patch User Successfully");
    }

    @Operation(summary = "Delete user", description = "Delete user by user ID")
    @DeleteMapping("/{userId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseData<?> deleteUser(@PathVariable("userId") int userId) {
        System.out.println("User ID: " + userId);
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "Delete User Successfully");
    }

    @Operation(summary = "Get user", description = "Get user information by user ID")
    @GetMapping("/{userId}")
    public ResponseData<UserRequestDTO> getUser(
            @PathVariable("userId") int userId
    ) {
        System.out.println("User ID: " + userId);

        return new ResponseData<>(
                HttpStatus.OK.value(),
                "Get User Successfully",
                new UserRequestDTO(
                        "Tay",
                        "Java",
                        "lenhathuy@gmail.com",
                        "0123456789",
                        null,
                        null,
                        null,
                        null
                )
        );
    }


    @Operation(summary = "Get user list", description = "Get list of users with pagination")
    @GetMapping("/list")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseData<List<UserRequestDTO>> getUserList(@RequestParam(defaultValue = "0")  int pageNo,@Min(10) @RequestParam(defaultValue = "20", required = false) int pageSize ) {
        System.out.println("Page number: " + pageNo);
        System.out.println("Page size: " + pageSize);

        return new ResponseData<>(
                HttpStatus.OK.value(),
                "Get User List Successfully",
                List.of(
                        new UserRequestDTO(
                                "Tay",
                                "Java",
                                "le@gmail.com",
                                "0123456789",
                                null,
                                null,
                                null,
                                null
                        ),
                        new UserRequestDTO(
                                "Nhat",
                                "Huynh",
                                "huy@gmail.com",
                                "0987654321",
                                null,
                                null,
                                null,
                                null
                        )
                )
        );
    }
}
