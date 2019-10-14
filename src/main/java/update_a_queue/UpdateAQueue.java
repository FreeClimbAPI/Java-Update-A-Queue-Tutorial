package main.java.update_a_queue;

import com.vailsys.persephony.api.PersyClient;
import com.vailsys.persephony.api.PersyException;
import com.vailsys.persephony.api.queue.Queue;
import com.vailsys.persephony.api.queue.QueueUpdateOptions;

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
      // Create PersyClient object
      PersyClient client = new PersyClient(accountId, authToken);

      // Options payload to change the alias and payload of the specified queue
      QueueUpdateOptions options = new QueueUpdateOptions();
      options.setAlias("Updated Alias");
      options.setMaxSize(12);

      // Invoke update method to modify the queue
      Queue queue = client.queues.update(queueId, options);

    } catch (PersyException e) {
      // Exception throw upon failure
    }
  }
}
