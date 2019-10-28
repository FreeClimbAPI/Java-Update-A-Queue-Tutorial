package main.java.update_a_queue;

import com.vailsys.freeclimb.api.FreeClimbClient;
import com.vailsys.freeclimb.api.FreeClimbException;
import com.vailsys.freeclimb.api.queue.Queue;
import com.vailsys.freeclimb.api.queue.QueueUpdateOptions;

public class UpdateAQueue {

  public static void main(String[] args) {
    String accountId = System.getenv("ACCOUNT_ID");
    String authToken = System.getenv("AUTH_TOKEN");
    // TODO: Provide queueId
    String queueId = "";

    updateAQueue(queueId, accountId, authToken);
  }

  public static void updateAQueue(String queueId, String accountId, String authToken) {
    try {
      // Create FreeClimbClient object
      FreeClimbClient client = new FreeClimbClient(accountId, authToken);

      // Options payload to change the alias and payload of the specified queue
      QueueUpdateOptions options = new QueueUpdateOptions();
      options.setAlias("Updated Alias");
      options.setMaxSize(12);

      // Invoke update method to modify the queue
      Queue queue = client.queues.update(queueId, options);

    } catch (FreeClimbException e) {
      // Exception throw upon failure
    }
  }
}
