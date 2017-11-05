private int quantity;
    private String cellPhone;
    private String email;
    private double distance;
    private Button SL = (Button) findViewById(R.id.button5);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        SL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity = 1;
                cellPhone = "123-456-7890";
                email = "emilyle123@gmail.com";
                distance = 0.5;

                AlertDialog.Builder builder = new AlertDialog.Builder(MainMenu.this);

                builder.setCancelable(true);
                builder.setTitle("She needs you!");
                builder.setMessage("Emily Le needs " + quantity + " pads!\n"
                        + "Her contact information is " + cellPhone + " and "
                        + email +"\nShe is " + distance + " miles away from you. Please help her!");

                builder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        startActivity(new Intent(MainMenu.this, MainMenu.class));
                    }
                });

                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(MainMenu.this, scannerpage.class));
                    }
                });
                builder.show();
            }
        });
    }