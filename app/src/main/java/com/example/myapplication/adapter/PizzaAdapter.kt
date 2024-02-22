package com.example.myapplication.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.databinding.ItemBinding
import com.example.myapplication.model.Pizza
import androidx.recyclerview.widget.RecyclerView


class PizzaAdapter(
    private var  PizzaClick: (Pizza) -> Unit

): RecyclerView.Adapter<PizzaAdapter.ViewHolder>() {
    private var ListOfPizza: List<Pizza> = ArrayList()
    fun setData(pizza: List<Pizza>) {
        ListOfPizza = pizza
        /**
         * метод для обновления списка элементов
         */

        notifyDataSetChanged()
    }
    /**
     * метод, который будет создавать view для каждого объекта
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }




    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pizza = ListOfPizza[position]
        holder.bind(pizza)
    }

    /**
     * метод, для определения количесвта элементов списка
     */
    override fun getItemCount(): Int = ListOfPizza.size

    /**
     * для вызова метода из ViewHolder'a
     */

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val pizza = ListOfPizza[position]
                    PizzaClick(pizza)
                }
            }
        }
        /// inner class ViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener{
//        val textView: TextView = view.findViewById(R.id.gmrowtextview)
//        init {
//            view.setOnClickListener(this)
//        }
//        override fun onClick(v: View?) {
//            val position = bindingAdapterPosition
//            if (position != RecyclerView.NO_POSITION){
//                listener.onItemClick(position)
//            }
//        }
        fun bind(pizza: Pizza) {
            with(binding) {
                ImageOfPizza.setImageResource(pizza.image)
                title.text = pizza.title
                description.text = pizza.description
                price.text = pizza.price.toString()

                root.setOnClickListener{
                    PizzaClick(pizza)
                }
            }
        }
//        fun bind(movie: Movie) {
//            with(binding) {
//                movieImage.setImageResource(movie.imageRes)
//                movieTitle.text = movie.title
//                movieDescription.text = movie.shortDescription
//                movieRating.text = "${movie.rating}/5"
//                movieGenre.text = movie.genre.first().value
    }
}