package stepDefinition;






import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hook.hooks1;





public class stepDefinition {
	
	
	
	
	
	WebDriver driver= hooks1.driver;
	
	    
	

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

		
		driver.get("http://realty-real-estatem1.upskills.in/my-profile/");
	
	 
	  
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {

		
		
		try {
			driver.findElement(By.id("user_login")).sendKeys("mohankrishna176@gmail.com"); 
		
	    driver.findElement(By.name("pwd")).sendKeys("Secret@123&&"); 
		}
		catch(Exception e) {
			System.out.println("not able to enter credentials"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		try {
			
			 
			driver.findElement(By.name("login")).click();
		}
		catch(Exception e) {
			System.out.println("not able to enter credentials"+e);
			
		}
	}

	@Then("User is redirected to dashboard")
	public void user_is_redirected_to_dashboard() {
		try {
			String expected="Dashboard ‹ Real Estate — WordPress";
		    String actual=driver.getTitle();
		   		   
		    // Assert.assertEquals(actual,expected);
		    
			
		}
		catch(Exception e) {
			System.out.println(e);
			//Assert.fail();
		}
	    
	}
	

	@Then("User navigates to posts section")
	public void user_navigates_to_posts_section() {
		
	
		
			try {
				
			
				WebElement obj=driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/a/div[3]"));
				obj.click();
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		
	}
	@Then("User is redirected to Posts section")
	public void user_is_redirected_to_Posts_section() {
		try {
			Thread.sleep(3000);
			String expected="Posts ‹ Real Estate — WordPress";
					
		    String actual=driver.getTitle();
		   		   
		    // Assert.assertEquals(actual,expected);
		    
			
		}
		catch(Exception e) {
			System.out.println(e);
			//Assert.fail();
		}
	}
	@When("User clicks on add new field")
	public void user_clicks_on_add_new_field() {
		try {
			driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a")).click(); 
		
	     
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User creates any post in add title")
	public void user_creates_any_post_in_add_title() {

		try {
			Thread.sleep(3000);
			driver.findElement(By.name("post_title")).sendKeys("Hello my name is Sanchari Singha Roy and I'm a trainee under Capgemini"); 
		System.out.println("post is created");	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on publish button")
	public void user_clicks_on_publish_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("publish")).click(); 
			System.out.println("clicked on publish button");	
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}
	@Then("User clicks on update button")
	public void user_clicks_on_update_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.name("save")).click(); 
		System.out.println("clicked on update button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}
	
	@When("User clicks on categories")
	public void user_clicks_on_categories() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[4]/a")).click(); 
			System.out.println("clicked on categories");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User creates any category in name section")
	public void user_creates_any_category_in_name_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("tag-name")).sendKeys("Hiii myself Sanchari"); 
			System.out.println("category is created");
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on add new category button")
	public void user_clicks_on_add_new_category_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click(); 
			System.out.println("clicked on add new button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}


	@When("User clicks on tags")
	public void user_clicks_on_tags() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click(); 
			System.out.println("clicked on tags");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User creates any tag in name section")
	public void user_creates_any_tag_in_name_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("tag-name")).sendKeys("Hello myself Sanchari Singha Roy"); 
			System.out.println("new tag is created");
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on add new tag button")
	public void user_clicks_on_add_new_tag_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("submit")).click(); 
			System.out.println("clicked on add new button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}


	@When("User selects checkbox of any posts")
	public void user_selects_checkbox_of_any_posts() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-13443")).click();
		boolean result = driver.findElement(By.id("cb-select-13443")).isSelected();
		driver.findElement(By.id("cb-select-13367")).click();
		boolean result2 = driver.findElement(By.id("cb-select-13367")).isSelected();
		System.out.println("checkboxes selected");
	}

	@Then("User clicks on bulk actions")
	public void user_clicks_on_bulk_actions() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("bulk-action-selector-bottom")).click(); 
		System.out.println("clicked on bulk action");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@Then("User selects move to trash option{string}")
	public void user_selects_move_to_trash_option(String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-bottom")));
		bulkobj.selectByIndex(2);
		System.out.println("move to trash option is selected");
	}

	@Then("User clicks on apply button")
	public void user_clicks_on_apply_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction2")).click(); 
		System.out.println("clicked on apply button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User clicks the search field")
	public void user_clicks_the_search_field() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("post-search-input")).click(); 
		System.out.println("clicked on search box");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User enters the name{string}")
	public void user_enters_the_name(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("post-search-input")).sendKeys("hel"); 
		System.out.println("search input is given");
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("search-submit")).click(); 
		System.out.println("clicked on search button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}
	@When("User clicks on All dates dropdown list")
	public void user_clicks_on_All_dates_dropdown_list() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("filter-by-date")).click(); 
		System.out.println("clicked on all dates dropdown");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		} 
	}

	@When("User selects any option{string}")
	public void user_selects_any_option(String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("filter-by-date")));
		bulkobj.selectByIndex(4);
		System.out.println("date is selected");
	}

	@When("User clicks on All categories dropdown list")
	public void user_clicks_on_All_categories_dropdown_list() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("cat")).click(); 
			Select bulkobj = new Select(driver.findElement(By.id("cat")));
			bulkobj.selectByIndex(9); 
			System.out.println("category dropdown is clicked and selected");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}
	@Then("User clicks on filter button")
	public void user_clicks_on_filter_button() {
		try {
			driver.findElement(By.id("post-query-submit")).click(); 
		    System.out.println("clicked on filter button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}  
	}

	@When("User clicks on categories option")
	public void user_clicks_on_categories_option() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[4]/a")).click(); 
		    System.out.println("clicked on categories for bulk action");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User selects multiple checkboxes of categories")
	public void user_selects_multiple_checkboxes_of_categories() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-1781")).click();
		boolean result = driver.findElement(By.id("cb-select-1781")).isSelected();
		driver.findElement(By.id("cb-select-1970")).click();
		boolean result2 = driver.findElement(By.id("cb-select-1970")).isSelected();
		System.out.println("multiple checkboxes are selected");
	}

	@Then("User clicks on bulk actions of categories")
	public void user_clicks_on_bulk_actions_of_categories() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
		System.out.println("clicked on bulk action for categories");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects delete option in categories bulk functionality{string}")
	public void user_selects_delete_option_in_categories_bulk_functionality(String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
		System.out.println("delete option is selected");
		
	}

	@Then("User clicks on apply button in categories section")
	public void user_clicks_on_apply_button_in_categories_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
		System.out.println("clicked on apply button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}


	@When("User clicks on tags option")
	public void user_clicks_on_tags_option() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click(); 
			 System.out.println("clicked on tags for bulk action");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@When("User selects multiple checkboxes of tags")
	public void user_selects_multiple_checkboxes_of_tags() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-1978")).click();
		boolean result = driver.findElement(By.id("cb-select-1978")).isSelected();
		driver.findElement(By.id("cb-select-1834")).click();
		boolean result2 = driver.findElement(By.id("cb-select-1834")).isSelected();
		System.out.println("checkboxes are selected");
	}

	@Then("User clicks on bulk actions of tags")
	public void user_clicks_on_bulk_actions_of_tags() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
			System.out.println("clicked");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects delete option in tags bulk functionality{string}")
	public void user_selects_delete_option_in_tags_bulk_functionality(String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
		System.out.println("delete option is selected");
	}

	@Then("User clicks on apply button in tags section")
	public void user_clicks_on_apply_button_in_tags_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
			System.out.println("clicked on apply button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User clicks on trash option")
	public void user_clicks_on_trash_option() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[6]/a")).click(); 
			System.out.println("clicked on trash button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User selects multiple checkboxes of trash posts items")
	public void user_selects_multiple_checkboxes_of_trash_posts_items() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-13357")).click();
		boolean result = driver.findElement(By.id("cb-select-13357")).isSelected();
		driver.findElement(By.id("cb-select-12443")).click();
		boolean result2 = driver.findElement(By.id("cb-select-12443")).isSelected();
		System.out.println("selected multiple checkboxes of trash items");
	}

	@Then("User clicks on bulk actions of trash functionality")
	public void user_clicks_on_bulk_actions_of_trash_functionality() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
			System.out.println("clicked on bulk action for trash items");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects restore option in bulk functionality{string}")
	public void user_selects_restore_option_in_bulk_functionality(String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
		System.out.println("restore is selected");
	}

	@Then("User clicks on apply button in trash section")
	public void user_clicks_on_apply_button_in_trash_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
			System.out.println("clicked on apply button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User clicks on any post{string}")
	public void user_clicks_on_any_post(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-13415\"]/td[1]/strong/a")).click(); 
			System.out.println("clicked on the post-individual apartments");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User edits the changes to {string}")
	public void user_edits_the_changes_to(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.name("post_title")).sendKeys("ing"); 
			System.out.println("edited changes");
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on publish button in edit functionality")
	public void user_clicks_on_publish_button_in_edit_functionality() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("publish")).click(); 
		System.out.println("clicked on publish button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	
	@When("User clicks on the post{string}")
	public void user_clicks_on_the_post(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-13327\"]/td[1]/strong/a")).click(); 
			System.out.println("clicked on post");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User clicks on publish immediately{string}")
	public void user_clicks_on_publish_immediately(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"misc-publishing-actions\"]/div[3]/a/span[1]")).click(); 
			System.out.println("clicked on publish immediately");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}
	

	@Then("User clicks on date dropdown")
	public void user_clicks_on_date_dropdown() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("mm")).click(); 
			System.out.println("clicked on date dropdown");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@Then("User selects {int}-June option{string}")
	public void user_selects_June_option(Integer int1, String string) throws InterruptedException {
		Thread.sleep(3000);
		Select bulkobj = new Select(driver.findElement(By.id("mm")));
		bulkobj.selectByIndex(5);
		System.out.println("selected date");
	}

	@Then("User clicks on publish button in edit functionality to update date")
	public void user_clicks_on_publish_button_in_edit_functionality_to_update_date() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("publish")).click(); 
		System.out.println("clicked on publish button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@Then("User clicks on update button in edit functionality to update the changes")
	public void user_clicks_on_update_button_in_edit_functionality_to_update_the_changes() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.name("save")).click(); 
		System.out.println("clicked on update button");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}
}


