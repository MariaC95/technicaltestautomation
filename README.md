
# TechnicalTest

After reviewing the website https://automationexercise.com, the six most important user journeys are:
- Register user
- Verify product quantity in cart
- Place order: Login before checkout
- Remove products from cart
- Search products and verify cart after login
- Add review on product

as these are the journeys that a customer using the website will make most frequently, therefore should be automated in order to minimise errors and boost the quality of the experience on the website.

The first 4 journeys chosen to be automated are:

**Register user** - there are a lot of steps and manual effort involved in filling out the forms, this will increase efficiency of regression testing.

**Place order: Login before checkout** - this functionality is how the business makes profit, so it is vital to ensure that placing an order can be completed.

**Verify product quantity in cart** - as well as being able to adjust the quantity of the product, this journey incorporates viewing the product and verifying the details of the product, all of which are important aspects of the customer experience.

**Remove products from cart** - by automating this functionality, we are ensuring that the customer can edit their basket in order to finalise their purchase which is beneficial for customer statisfaction and trust in the company.


# Framework
I initially set out to use testng because of the ability to run paralle tests and that is more efficient for web applications. 
However, my 5+ years of experience is in mobile testing using junit, and because testng uses different syntax and works/runs differently, I was unable to showcase my abilities 
with the timeframe provided, but have learned a lot about testng and will continue to develop in it.
I used a Maven structure, ran in Junit using Selenium WebDriver with Cucumber software tool and Gherkin language parser to execute the BDD tests.
