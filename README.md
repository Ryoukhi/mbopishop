# mbopishop

src/
└── main/
    └── java/
        └── com/
            └── mbopi/
                └── ecommerce/
                    │
                    ├── config/
                    │   └── OpenApiConfig.java
                    │
                    ├── controller/
                    │   ├── AuthController.java
                    │   ├── ProductController.java
                    │   ├── CategoryController.java
                    │   ├── CartController.java
                    │   ├── OrderController.java
                    │   └── AdminController.java
                    │
                    ├── entity/
                    │   ├── User.java
                    │   ├── Role.java
                    │   ├── Product.java
                    │   ├── Category.java
                    │   ├── Cart.java
                    │   ├── CartItem.java
                    │   ├── Order.java
                    │   ├── OrderItem.java
                    │   └── Payment.java
                    │
                    ├── repository/
                    │   ├── UserRepository.java
                    │   ├── ProductRepository.java
                    │   ├── CategoryRepository.java
                    │   ├── CartRepository.java
                    │   ├── OrderRepository.java
                    │   └── PaymentRepository.java
                    │
                    ├── service/
                    │   ├── UserService.java
                    │   ├── ProductService.java
                    │   ├── CategoryService.java
                    │   ├── CartService.java
                    │   ├── OrderService.java
                    │   └── PaymentService.java
                    │
                    ├── serviceimpl/
                    │   ├── UserServiceImpl.java
                    │   ├── ProductServiceImpl.java
                    │   ├── CategoryServiceImpl.java
                    │   ├── CartServiceImpl.java
                    │   ├── OrderServiceImpl.java
                    │   └── PaymentServiceImpl.java
                    │
                    ├── security/
                    │   ├── SecurityConfig.java
                    │   ├── JwtAuthenticationFilter.java
                    │   ├── JwtAuthorizationFilter.java
                    │   ├── JwtTokenProvider.java
                    │   ├── UserDetailsServiceImpl.java
                    │   └── PasswordEncoderConfig.java
                    │
                    ├── dto/
                    │   ├── LoginRequest.java
                    │   ├── LoginResponse.java
                    │   ├── RegisterRequest.java
                    │   ├── ProductRequest.java
                    │   ├── ProductResponse.java
                    │   ├── OrderRequest.java
                    │   └── OrderResponse.java
                    │
                    ├── exception/
                    │   ├── ResourceNotFoundException.java
                    │   ├── BusinessException.java
                    │   └── GlobalExceptionHandler.java
                    │
                    ├── mapper/
                    │   ├── ProductMapper.java
                    │   ├── OrderMapper.java
                    │   └── UserMapper.java
                    │
                    └── MbopiEcommerceApplication.java
