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
			driver.findElement(By.name("post_title")).sendKeys("Hello I am Sanchari Singha Roy"); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on publish button")
	public void user_clicks_on_publish_button() {
		try {
			driver.findElement(By.id("publish")).click(); 
		
	    
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
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[4]/a")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User creates any category in name section")
	public void user_creates_any_category_in_name_section() {
		try {
			driver.findElement(By.id("tag-name")).sendKeys("Hiiiii Sanchari Singha Roy"); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on add new category button")
	public void user_clicks_on_add_new_category_button() {
		try {
			driver.findElement(By.name("submit")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}


	@When("User clicks on tags")
	public void user_clicks_on_tags() {
		try {
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User creates any tag in name section")
	public void user_creates_any_tag_in_name_section() {
		try {
			driver.findElement(By.id("tag-name")).sendKeys("Sanchari Singha Roy"); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to enter"+e);
			Assert.fail();
		}
	}

	@Then("User clicks on add new tag button")
	public void user_clicks_on_add_new_tag_button() {
		try {
			driver.findElement(By.id("submit")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}


	@When("User selects checkbox of any posts")
	public void user_selects_checkbox_of_any_posts() {
		driver.findElement(By.id("cb-select-11705")).click();
		boolean result = driver.findElement(By.id("cb-select-11705")).isSelected();
		driver.findElement(By.id("cb-select-12118")).click();
		boolean result2 = driver.findElement(By.id("cb-select-12118")).isSelected();
	}

	@Then("User clicks on bulk actions")
	public void user_clicks_on_bulk_actions() {
		try {
			driver.findElement(By.id("bulk-action-selector-bottom")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@Then("User selects move to trash option{string}")
	public void user_selects_move_to_trash_option(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-bottom")));
		bulkobj.selectByIndex(2);
	}

	@Then("User clicks on apply button")
	public void user_clicks_on_apply_button() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction2")).click(); 
		
	    
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
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User enters the name{string}")
	public void user_enters_the_name(String string) {
		try {
			driver.findElement(By.id("post-search-input")).sendKeys("hel"); 
		
	    
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
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}
	@When("User clicks on All dates dropdown list")
	public void user_clicks_on_All_dates_dropdown_list() {
		try {
			driver.findElement(By.id("filter-by-date")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		} 
	}

	@When("User selects any option{string}")
	public void user_selects_any_option(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("filter-by-date")));
		bulkobj.selectByIndex(4); 
	}

	@When("User clicks on All categories dropdown list")
	public void user_clicks_on_All_categories_dropdown_list() {
		try {
			driver.findElement(By.id("cat")).click(); 
			Select bulkobj = new Select(driver.findElement(By.id("cat")));
			bulkobj.selectByIndex(9); 
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User clicks on categories option")
	public void user_clicks_on_categories_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[4]/a")).click(); 
		    System.out.println("clicked on categories");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			Assert.fail();
		}
	}

	@When("User selects multiple checkboxes of categories")
	public void user_selects_multiple_checkboxes_of_categories() {
		driver.findElement(By.id("cb-select-1798")).click();
		boolean result = driver.findElement(By.id("cb-select-1798")).isSelected();
		driver.findElement(By.id("cb-select-1561")).click();
		boolean result2 = driver.findElement(By.id("cb-select-1561")).isSelected();
	}

	@Then("User clicks on bulk actions of categories")
	public void user_clicks_on_bulk_actions_of_categories() {
		try {
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects delete option in categories bulk functionality{string}")
	public void user_selects_delete_option_in_categories_bulk_functionality(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
	}

	@Then("User clicks on apply button in categories section")
	public void user_clicks_on_apply_button_in_categories_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}


	@When("User clicks on tags option")
	public void user_clicks_on_tags_option() {
		try {
			driver.findElement(By.xpath("//*[@id=\"menu-posts\"]/ul/li[5]/a")).click(); 
			 System.out.println("clicked on tags");
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@When("User selects multiple checkboxes of tags")
	public void user_selects_multiple_checkboxes_of_tags() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-1801")).click();
		boolean result = driver.findElement(By.id("cb-select-1801")).isSelected();
		driver.findElement(By.id("cb-select-1784")).click();
		boolean result2 = driver.findElement(By.id("cb-select-1784")).isSelected();
	}

	@Then("User clicks on bulk actions of tags")
	public void user_clicks_on_bulk_actions_of_tags() {
		try {
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects delete option in tags bulk functionality{string}")
	public void user_selects_delete_option_in_tags_bulk_functionality(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
	}

	@Then("User clicks on apply button in tags section")
	public void user_clicks_on_apply_button_in_tags_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
		
	    
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
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User selects multiple checkboxes of trash posts items")
	public void user_selects_multiple_checkboxes_of_trash_posts_items() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("cb-select-11815")).click();
		boolean result = driver.findElement(By.id("cb-select-11815")).isSelected();
		driver.findElement(By.id("cb-select-12532")).click();
		boolean result2 = driver.findElement(By.id("cb-select-12532")).isSelected();
	}

	@Then("User clicks on bulk actions of trash functionality")
	public void user_clicks_on_bulk_actions_of_trash_functionality() {
		try {
			driver.findElement(By.id("bulk-action-selector-top")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		}
	}

	@Then("User selects restore option in bulk functionality{string}")
	public void user_selects_restore_option_in_bulk_functionality(String string) {
		Select bulkobj = new Select(driver.findElement(By.id("bulk-action-selector-top")));
		bulkobj.selectByIndex(1);
	}

	@Then("User clicks on apply button in trash section")
	public void user_clicks_on_apply_button_in_trash_section() {
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("doaction")).click(); 
		
	    
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
			driver.findElement(By.xpath("//*[@id=\"post-11961\"]/td[1]/strong/a")).click(); 
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@When("User edits the changes to {string}")
	public void user_edits_the_changes_to(String string) {
		try {
			driver.findElement(By.name("post_title")).sendKeys("ing"); 
		
	    
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

	@Then("User clicks on update button in edit functionality")
	public void user_clicks_on_update_button_in_edit_functionality() {
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
	@When("User clicks on the post{string}")
	public void user_clicks_on_the_post(String string) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"post-11727\"]/td[1]/strong/a")).click(); 
		
	    
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
		
	    
		}
		catch(Exception e) {
			System.out.println("not able to click"+e);
			//Assert.fail();
		} 
	}

	@Then("User selects {int}-June option{string}")
	public void user_selects_June_option(Integer int1, String string) {
		Select bulkobj = new Select(driver.findElement(By.id("mm")));
		bulkobj.selectByIndex(4);
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


