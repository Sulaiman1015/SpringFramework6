***
Spring container only managed all stage of singleton's scope lifecycle,
in prototype scope bean, when user got to us bean, spring not to manage to destroy this bean


Bean lifecycle 5 stages:
    1: Instantiation, invoking constructor
    2: Property setting (attribute assignment), invoking setter method
    3: Initialization, using custom initialization method within bean class
    4: Usage bean
    5: Destruction

Bean lifecycle 7 stages:
    1: Instantiation, invoking constructor
    2: Property setting (attribute assignment), invoking setter method
    3: Before methode, implement BeanPostProcessor interface
    4: Initialization, using custom initialization method within bean class
    5: After method, implement BeanPostProcessor interface
    6: Usage bean
    7: Destruction