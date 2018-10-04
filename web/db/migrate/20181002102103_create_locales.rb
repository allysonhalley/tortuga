class CreateLocales < ActiveRecord::Migration[5.0]
  def change
    create_table :locales do |t|
      t.string :street
      t.string :number
      t.string :cep
      t.string :complement
      t.string :lat
      t.string :long

      t.timestamps
    end
  end
end
